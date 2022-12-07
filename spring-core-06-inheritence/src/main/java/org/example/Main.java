package org.example;

import model.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Database mysql = (Database) configurableApplicationContext.getBean("mysql");
        Database oracle = (Database) configurableApplicationContext.getBean("oracle");

        System.out.println(mysql);
        System.out.println(oracle);
        configurableApplicationContext.close();
    }
}