package org.example;

import models.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        applicationContext.getBean(DBConnection.class).connect();

        System.out.println(applicationContext.getBean(DBConnection.class).getList());

    }
}