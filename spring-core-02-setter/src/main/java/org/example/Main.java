package org.example;

import Entity.AppConfig;
import Entity.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // applicationContext.xml dosyası kullanarak oluşturulan bean
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        configurableApplicationContext.getBean("dbConnection", DBConnection.class).connectDB();
        configurableApplicationContext.getBean("dbConnection",DBConnection.class).disconnectDB();

        //AppConfig class'ı kullanılarak oluşturulan bean
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.getBean(DBConnection.class).connectDB();
        applicationContext.getBean(DBConnection.class).disconnectDB();

        // başka bir xml dosyasında parametreleri constructor üzerinden veren bean oluşturduk
        ConfigurableApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContextWithCons.xml");
        applicationContext1.getBean(DBConnection.class,"dbConnectionCons").connectDB();
        applicationContext1.getBean(DBConnection.class,"dbConnectionCons").disconnectDB();

    }
}