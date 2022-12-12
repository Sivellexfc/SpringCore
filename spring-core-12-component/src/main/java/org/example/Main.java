package org.example;

import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //applicationContext.getBean("DBConnection", DBConnection.class).toString();
        System.out.println("database :" + applicationContext.getBean("DBConnection", DBConnection.class).getDatabase());

    }
}