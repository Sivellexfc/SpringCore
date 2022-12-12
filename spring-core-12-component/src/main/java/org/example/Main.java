package org.example;

import config.AppConfig;
import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("XML ************** :" + applicationContext.getBean("DBConnection", DBConnection.class).getDatabase());

        ConfigurableApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("CONFİG *************" + applicationContext1.getBean(DBConnection.class).toString());
    }
}