package selfproject.ffboard.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

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

}
