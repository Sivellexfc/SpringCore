package org.example;

import models.SendMailPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SendMailPublisher sendMailPublisher = (SendMailPublisher) configurableApplicationContext.getBean("sendMailPublisher");
        sendMailPublisher.userRegistryMessage();
        configurableApplicationContext.close();

    }
}