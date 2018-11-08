package selfproject.ffboard.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"selfproject.ffboard.dao",
                                "selfproject.ffboard.service",
                                "selfproject.ffboard.exception"})
@Import( {DBConfig.class})
public class ApplicationConfig {
}
