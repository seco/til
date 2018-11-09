package examples.boot.springboard.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@PropertySource("application.properties")
public class WebConfig  implements WebMvcConfigurer {

    @Autowired
    Environment environment;

//    @Value("${serverInfo.ip}") String ip;
//    @Value("${serverInfo.port}") int port;
    @Bean
    public ServerInfo serverInfo() {
        ServerInfo serverInfo = new ServerInfo();
//        serverInfo.setIp(ip);
//        serverInfo.setPort(port);
        serverInfo.setIp(environment.getProperty("serverInfo.ip"));
        serverInfo.setPort(Integer.parseInt(environment.getProperty("serverInfo.port")));
        return serverInfo;
    }
}
