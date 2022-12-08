package model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "database.properties")
public class AppConfig {

    @Value("${url}")
    private String url;

    @Value("${database-username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean
    public Database database(){
        return new Database(url,username,password);
    }

}
