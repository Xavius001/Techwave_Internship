package org.example;

import org.example.pojo.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) factory.getBean("T");
        Triangle triangle1 = (Triangle) factory.getBean("T1");
        Triangle triangle2 = (Triangle) factory.getBean("T2");
        System.out.println(triangle);
        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}