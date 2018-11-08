package selfproject.ffboard.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import selfproject.ffboard.dto.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class AdminDao {
    private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;

    public AdminDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("memberPermission")
                .usingGeneratedKeyColumns("id");
    }

    public List<Member> getMembers(int pg, String email, int limit) throws DataAccessException {
        String sql;
        RowMapper<Member> rowMapper = new BeanPropertyRowMapper<>().newInstance(Member.class);
        Map<String, Object> params = new HashMap<>();

        if(!email.equals("")) {
            sql = "SELECT id, email, nick_name FROM member WHERE email=:email";
            params.put("email", email);
        }
        else {
            sql = "SELECT id, email, nick_name FROM member LIMIT :pg, :limit";
            params.put("pg", pg*limit - limit+1);
            params.put("limit", limit);
        }
        return jdbc.query(sql, params, rowMapper);
    }

    // permission 테이블에 어떤 row가있는지 받아서 관리자 페이지 테이블에 전송
    public List<String> getPermissions() throws DataAccessException {
        String sql = "SELECT name FROM permission";
        return jdbc.query(sql, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("name");
            }
        });
    }

    public List<String> getMemPerm(Long id) throws DataAccessException {
        String sql = "SELECT perm_name FROM member_permission WHERE member_id = :id";
        Map<String, Long> params = Collections.singletonMap("id", id);
        return jdbc.query(sql, params, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("perm_name");
            }
        });
    }

    /**
     *
     */

    public void update(String id, String[] perms) throws DataAccessException {
        String sql = "DELETE FROM member_permission WHERE member_id=:id";
        Map<String, String> params = new HashMap<>();
        params.put("id", id);
        jdbc.update(sql, params);

        for(String perm : perms) {
            sql = "INSERT INTO member_permission(member_id, perm_name) " +
                    "VALUES (:id, :perm)";
            params.put("perm", perm);
            jdbc.update(sql, params);
            params.remove(perm);
        }
    }

    public int memberCount() throws DataAccessException {
        String sql = "SELECT COUNT(*) FROM member";
        Map<String, Object> params = new HashMap<>();
        return jdbc.queryForObject(sql, params, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt(1)-1;
            }
        });
    }
}
