package Entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("dbc")
    public DBConnection dbConnectionManager(){
        return new DBConnection("mysql:localhost:8080/jpa_database","DBConnection_SystemDatabase7172","123456789");
    }
}
