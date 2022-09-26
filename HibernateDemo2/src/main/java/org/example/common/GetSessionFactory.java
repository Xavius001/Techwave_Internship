package org.example.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionFactory {
    public static SessionFactory getFactory() {
        Configuration C = new Configuration();
        C.configure("hibernate.cfg.xml");
        return C.buildSessionFactory();
    }
}
