package selfproject.ffboard.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import selfproject.ffboard.dto.Member;

import javax.sql.DataSource;
import java.util.*;

@Repository
public class MemberDao {
    private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;

    public MemberDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("member")
                .usingGeneratedKeyColumns("id");
    }

    public Long signUp(Member member) throws DataAccessException {
        String sql = "SELECT * FROM member WHERE email = :email OR nick_name = :nickName";
        Map<String, Object> map = new HashMap<>();
        map.put("email", member.getEmail());
        map.put("nickName", member.getNickName());
        RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class);

        if (jdbc.query(sql, map, rowMapper).size() > 0 ) {
            sql = "SELECT * FROM member WHERE email=:email";
            if(jdbc.query(sql, map, rowMapper).size() > 0) {
                return -1L;
            } else {
                return -2L;
            }
        }
        SqlParameterSource params = new BeanPropertySqlParameterSource(member);
        return insertAction.executeAndReturnKey(params).longValue();
    }

    public Member login(Member member) throws DataAccessException {
        String sql = "SELECT id, email, nick_name FROM member WHERE email=:email AND password=:password";
        Map<String, String> map = new HashMap<>();
        map.put("email", member.getEmail());
        map.put("password", member.getPassword());

        RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class);
        return jdbc.queryForObject(sql, map, rowMapper);
    }
}
