package Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;


@Configuration
public class AppConfig {


    public Database database(){
        return new Database("oracle-localhost-3030","mhancavus","73RGBUN3IM3");
    }

    @Bean
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        dbConnection.setDatabase(this.database());
        return dbConnection;
    }

}
