package org.example;

import org.example.pojo.Rectangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("DISetterSpring.xml");
        ApplicationContext factory1 = new ClassPathXmlApplicationContext("DISetterSpring1.xml");
        Rectangle R = (Rectangle) factory.getBean("R");
        System.out.println(R);
        Rectangle R1 = (Rectangle) factory.getBean("R");
        System.out.println(R1);
        Rectangle R2 = (Rectangle) factory1.getBean("R");
        System.out.println(R);
        Rectangle R3 = (Rectangle) factory1.getBean("R");
        System.out.println(R1);
    }
}
