package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.AppConfig;
import services.DBConnection;

public class MainAnnotation {

    public static void main(String[] args) {

        System.out.println("\n\n With annotation \n\n");
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        configurableApplicationContext.getBean(DBConnection.class).connectDB();
        configurableApplicationContext.getBean(DBConnection.class).disconnectDB();

        configurableApplicationContext.close();


    }
}
