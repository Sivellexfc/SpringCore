package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Locale localeTr = new Locale("tr","TR");
        String message = configurableApplicationContext.getMessage("login.failed.error.messages",null,Locale.UK);
        System.out.println(message);
        configurableApplicationContext.close();
    }
}