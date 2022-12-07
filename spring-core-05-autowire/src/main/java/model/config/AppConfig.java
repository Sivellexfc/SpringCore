package model.config;

import model.DBConnection;
import model.Database;
import model.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Database database(){
        return new Database("mysql:sivellexf:localhost8080","root","1q2w3e4r5t");
    }
    @Bean
    public DBConnection dbConnection(){
        return new DBConnection(database(),properties());
    }
    @Bean
    public Properties properties(){
        return new Properties("property1","property2");
    }
}
