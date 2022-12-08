package org.example;

import model.AppConfig;
import model.AppConfigPropertySources;
import model.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigPropertySources.class);

        Database database = configurableApplicationContext.getBean(Database.class);
        Database databaseWithSources = applicationContext.getBean(Database.class);

        System.out.println(database);
        System.out.println(databaseWithSources);
    }
}