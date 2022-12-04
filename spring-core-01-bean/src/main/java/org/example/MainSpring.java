package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.DBConnection;

public class MainSpring {

    public static void main(String[] args) {

        System.out.println("\n\nSpring main\n\n");

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        DBConnection dbConnection = beanFactory.getBean(DBConnection.class,"dbconnect");

        dbConnection.connectDB();
        dbConnection.disconnectDB();

        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DBConnection dbConnection1 = abstractApplicationContext.getBean(DBConnection.class,"dbconnect");
        dbConnection1.connectDB();
        dbConnection1.disconnectDB();

        abstractApplicationContext.close();

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection2 = configurableApplicationContext.getBean(DBConnection.class,"dbconnect");
        dbConnection2.connectDB();
        dbConnection2.disconnectDB();

    }
}
