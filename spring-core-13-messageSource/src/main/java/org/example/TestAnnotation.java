package org.example;

import config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class TestAnnotation {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String message = applicationContext.getMessage("login.failed.error.messages",null, Locale.UK);
        System.out.println(message);

    }
}
