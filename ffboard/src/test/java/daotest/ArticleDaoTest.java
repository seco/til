package daotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import selfproject.ffboard.config.ApplicationConfig;
import selfproject.ffboard.dao.ArticleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void init() {
        System.out.println("init");
    }

}
