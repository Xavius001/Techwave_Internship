package org.example;

import org.example.common.GetSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OnetoOneMain {
    public static void main(String[] args) {
        SessionFactory factory = GetSessionFactory.getFactory();
        Session session = factory.openSession();
        session.close();
    }
}
