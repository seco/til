package selfproject.ffboard.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import selfproject.ffboard.dto.Article;

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
}
