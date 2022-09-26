package org.example.dao;

import org.example.common.ConnectionDB;
import org.example.pojo.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DbOperations {
    static SessionFactory factory;
    static Session session;
    static {
        factory = ConnectionDB.getSessionFactorydetails();

    }

    public static String InsertProject(Projects P) {
        session = factory.openSession();
        Transaction T = session.beginTransaction();
        session.save(P);
        T.commit();
        session.close();
        return "1 row inserted";
    }

    public static Projects fetchProjectByCode(int pcode) {
        session = factory.openSession();
        Projects P = session.get(Projects.class,pcode);
        return P;
    }

    public static String UpdateProjects(Projects P) {
        System.out.println(P);
        session = factory.openSession();
        Transaction T = session.beginTransaction();
        session.update(P);
        T.commit();
        session.close();
        return "1 row updated";
    }

    public static String DeleteProjects(Projects P) {
        System.out.println(P);
        session = factory.openSession();
        Transaction T = session.beginTransaction();
        session.delete(P);
        T.commit();
        session.close();
        return "1 row deleted";
    }
}


