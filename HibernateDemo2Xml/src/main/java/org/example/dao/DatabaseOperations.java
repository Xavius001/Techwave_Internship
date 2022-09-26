package org.example.dao;

import org.example.common.GetSessionFactory;
import org.example.pojo.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DatabaseOperations {
    static SessionFactory factory;
    static Session session;

    static { //invoked automatically/first
        factory = GetSessionFactory.getFactory();
    }

    public static String insertCustomer(Customer C) {
        session = factory.openSession();
        Transaction T = session.beginTransaction();
        session.save(C);
        T.commit();
        session.close();
        return "1 row inserted";
    }


}
