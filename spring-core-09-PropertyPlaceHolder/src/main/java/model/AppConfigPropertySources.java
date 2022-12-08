package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("database.properties")
})
public class AppConfigPropertySources {

    private final Environment environment;

    public AppConfigPropertySources(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public Database database(){
        return new Database(environment.getProperty("url"),
                            environment.getProperty("database-username"),
                            environment.getProperty("password"));
    }
}
