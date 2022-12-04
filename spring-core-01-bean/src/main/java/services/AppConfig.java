package services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.DBConnection;

@Configuration
public class AppConfig {

    @Bean("db")
    public DBConnection dbConnectionManager(){
        return new DBConnection();
    }
}
