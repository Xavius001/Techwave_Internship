package org.example.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDB {
    public static SessionFactory getSessionFactorydetails() {
        //access configuration .cfg.xml
        Configuration C = new Configuration();
        C.configure("hibernate.cfg.xml");

        //create sessionFactory object from Configuration
        SessionFactory factory = C.buildSessionFactory();
        //SessionFactory F = new Configuration().configure("org/example/hibernate.cfg.xml").buildSessionFactory();
        return factory;
    }

}
