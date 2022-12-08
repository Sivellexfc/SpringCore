package model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import javax.xml.crypto.Data;

public class BeanFactory implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor implementasyonu ile oluşturuldu.\n");
        Database mysql = (Database) beanFactory.getBean("mysql");
        System.out.println(mysql.getName());
    }
}
