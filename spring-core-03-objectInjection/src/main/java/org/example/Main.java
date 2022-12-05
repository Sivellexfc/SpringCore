package org.example;

import Model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // DBConnection nesnesi oluştuduğumuzda, içerisinde yer alan Database nesnesi otomatik olarak oluşturuluyor
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        applicationContext.getBean("dbConnection", DBConnection.class).connectDB();
        applicationContext.getBean("dbConnection",DBConnection.class).disconnectDB();
    }
}