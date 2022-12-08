package org.example;

import model.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        System.out.println("ApplicationContext dosyası okunuyor\n");
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Database oracle = (Database) configurableApplicationContext.getBean("oracle");
        Database mysql = (Database) configurableApplicationContext.getBean("mysql");
        System.out.println(oracle.getName());
        System.out.println(mysql.getName());
    }
}