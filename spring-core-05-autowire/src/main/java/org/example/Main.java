package org.example;

import model.DBConnection;
import model.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Autowiring with .xml file
        /*ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        configurableApplicationContext.getBean(DBConnection.class).connectDB();*/

        // Autowiring with AppConfig class
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        applicationContext.getBean(DBConnection.class).connectDB();
        applicationContext.getBean(DBConnection.class).disconnectDB();



    }
}