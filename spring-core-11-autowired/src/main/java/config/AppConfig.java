package config;

import model.DBConnection;
import model.Database;
import model.DbService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Database database(){
        return new Database("MSSQL:localhost8313","sivellexfcExcalibur","rootsifreadmin");
    }
    @Bean
    public DBConnection dbConnection(){
        return new DBConnection(database());
    }
}
