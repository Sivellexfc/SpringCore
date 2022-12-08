package org.example;

import model.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("ApplicationContext dosyası okunuyor\n");
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Database oracle = (Database) configurableApplicationContext.getBean("oracle");

        System.out.println(oracle.getName());
    }
}