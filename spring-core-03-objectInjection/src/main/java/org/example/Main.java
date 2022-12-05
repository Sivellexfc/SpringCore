package org.example;

import Model.AppConfig;
import Model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // DBConnection nesnesi oluştuduğumuzda, içerisinde yer alan Database nesnesi otomatik olarak oluşturuluyor
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        applicationContext.getBean("dbConnection", DBConnection.class).connectDB();
        applicationContext.getBean("dbConnection",DBConnection.class).disconnectDB();

        // AppConfig classı kullanarak bean oluşturduk
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        configurableApplicationContext.getBean(DBConnection.class).connectDB();
        configurableApplicationContext.getBean(DBConnection.class).disconnectDB();



    }
}