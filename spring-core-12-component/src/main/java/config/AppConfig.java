package config;

import model.DBConnection;
import model.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Database database(){
        return new Database("mysqlurl","username","passw");
    }
    @Bean
    public DBConnection dbConnection(){
        return new DBConnection(database());
    }
}
