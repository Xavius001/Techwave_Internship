package org.example;

import org.example.dao.DbOperations;
import org.example.pojo.Projects;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SessionFactory factory = ConnectionDB.getSessionFactorydetails();
//        Session session = factory.openSession();
//
//        Transaction T = session.beginTransaction();
//            Projects P = new Projects(1000,"VISA PROJECT",LocalDate.parse("2022-09-01"), 12);
//            session.save(P);
//            T.commit();
//            session.close();
//        factory.close();
        Scanner S = new Scanner(System.in);
        int pcode = S.nextInt();
        S.nextLine();
        String pdesc = S.nextLine();
        LocalDate stdate=LocalDate.parse(S.nextLine());
        int dur = S.nextInt();
        Projects P = new Projects(pcode, pdesc, stdate, dur);
        String Str = DbOperations.InsertProject(P);
        System.out.println(Str);
    }
}