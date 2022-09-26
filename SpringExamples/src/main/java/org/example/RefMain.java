package org.example;

import org.example.pojo.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("DISpringRef.xml");
        Square S = (Square) factory.getBean("S");
        System.out.println(S.getPointA().getX()+" "+S.getPointA().getY());
        System.out.println(S.getPointB().getX()+" "+S.getPointB().getY());
        System.out.println(S.getPointC().getX()+" "+S.getPointC().getY());
        System.out.println(S.getPointD().getX()+" "+S.getPointD().getY());
    }
}
