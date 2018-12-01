package selfproject.ffboard.dao;

import com.sun.javafx.collections.MappingChange;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import selfproject.ffboard.dto.Article;
import selfproject.ffboard.dto.ArticleContent;
import selfproject.ffboard.dto.ArticleFile;

import javax.sql.DataSource;
import java.util.*;

@Repository
public class ArticleDao {
    private NamedParameterJdbcTemplate jdbc;
    private JdbcTemplate originJdbc;
    private SimpleJdbcInsert insertActionArticle;
    private SimpleJdbcInsert insertActionArticleContent;
    private SimpleJdbcInsert insertAcionArticleCounting;
    private SimpleJdbcInsert insertActionFile;

    public ArticleDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        this.originJdbc = new JdbcTemplate(dataSource);
        this.insertActionArticle = new SimpleJdbcInsert(dataSource)
                .withTableName("article")
                .usingGeneratedKeyColumns("id")
                .usingColumns("title", "nick_name", "group_id", "depth_level", "group_seq", "category_id", "ip_adress", "member_id");
        this.insertAcionArticleCounting = new SimpleJdbcInsert(dataSource).withTableName("article_content");
    }

    public int arrangeGroupSeq(Long groupId, int groupSeq) {
        String sql = "UPDATE article SET group_seq= group_seq + 1 WHERE group_id = :groupId AND group_weq >= :groupSeq";
        Map<String, Number> map= new HashMap<>();
        map.put("groupId", groupId);
        map.put("groupSeq", groupSeq);
        return jdbc.update(sql, map);
    }

    public Long insertArticle(Article article) {
        SqlParameterSource params = new BeanPropertySqlParameterSource(article);
        return insertActionArticle.executeAndReturnKey(params).longValue();
    }

    public void insertGroupId() {
        String sql = "UPDATE article SET group_id=(SELECT LAST_INSERT_ID()) WHERE id = (SELECT LAST_INSERT_ID())";
        originJdbc.execute(sql);
    }

    public int insertArticleContent(ArticleContent articleContent) {
        SqlParameterSource params = new BeanPropertySqlParameterSource(articleContent);
        return insertActionArticleContent.execute(params);
    }

    public int insertFileInfo(Map<String, Object> fileInfo) {
        SqlParameterSource params = new MapSqlParameterSource(fileInfo);
        return insertActionFile.execute(params);
    }

    public ArticleFile getFileinfo(Long articleId) {
        String sql = "SELECT article_id, stored_name, origin_name, content_type, size, path FROM file" +
                "WHERE article_id = :articleId";

        try{
            RowMapper<ArticleFile> rowMapper = BeanPropertyRowMapper.newInstance(ArticleFile.class);
            Map<String, Long> params = Collections.singletonMap("articleId", articleId);
            return jdbc.queryForObject(sql, params, rowMapper);
        }catch (DataAccessException e) {
            return null;
        }
    }

    public int increaseHitCount(Long id) {
        String sql = "UPDATE article SET hit = hit + 1 WHERE id = :id";
        Map<String, Long> map = Collections.singletonMap("id", id);
        return jdbc.update(sql, map);
    }

    public int deleteArticle(Long id) {
        String sql = "UPDATE article SET is_deleted=TRUE WHERE id = :id";
        Map<String, Long> map = Collections.singletonMap("id", id);
        return jdbc.update(sql, map);
    }

    public Long updateArticle(Article article) {
        String sql = "UPDATE article SET title = :title, nick_name = :nickName, upddate = :upddate, ip_address = :ipAddress" +
                "WHERE id = :id";
        SqlParameterSource params = new BeanPropertySqlParameterSource(article);
        return article.getId();
    }

    public int updateAticleCount(ArticleContent articleContent) {
        String sql = "UPDATE article_counting SET count = count + 1 WHERE catetory_id = :catetoryId";
        SqlParameterSource params = new BeanPropertySqlParameterSource(articleContent);
        return  jdbc.update(sql, params);
    }

    public Article getArticle(Long id) {
        String sql = "SELECT id, title, hit, nick_name, group_id, depth_level, group_seq, regdate" +
                "upddate, category_id, ip_address, member_id, is_deleted " +
                "FROM article WHERE id = :id";
        try{
            RowMapper<Article> rowMapper = new BeanPropertyRowMapper(Article.class);
            Map<String, Long> params = Collections.singletonMap("id", id);
            return jdbc.queryForObject(sql, params, rowMapper);
        }catch (DataAccessException e) {
            return null;
        }
    }

    public ArticleContent getArticleContent(Long id) {
        String sql = "";
        
        return jdbc.queryForObject();
    }catch (DataAccessException e) {
        return null;
    }
}
