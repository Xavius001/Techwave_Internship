package org.example;

import org.example.dao.DBOperations;
import org.example.pojo.Emp;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Emp E = new Emp();

        //class code
        /*System.out.println("Enter empno");
        E.setEmpno(S.nextInt());
        S.nextLine();
        System.out.println("Enter ename");
        E.setEname(S.nextLine());
        System.out.println("Enter job");
        E.setJob(S.nextLine());
        System.out.println("Enter mgr");
        E.setMgr(S.nextInt());
        S.nextLine();

         */
        System.out.println("Enter hiredate");
        LocalDate hd = LocalDate.parse(S.nextLine());
        /*System.out.println("Enter sal");
        E.setSal(S.nextInt());
        S.nextLine();
        System.out.println("Enter comm");
        E.setComm(S.nextInt());
        S.nextLine();
        System.out.println("Enter deptno");
        E.setDeptno(S.nextInt());
        S.nextLine();
        String ms=DBOperations.insertEmp(E);
        System.out.println(ms);

         */
        List<Emp> L = DBOperations.getEmp(hd);
        L.stream().forEach(i -> System.out.println(i.getEmpno()));

        //delete
        /*
        System.out.println("Enter empno");
        E.setEmpno(S.nextInt());
        S.nextLine();
        DBOperations.deleteEmp(E);
         */


        //update
        /*
        System.out.println("Enter empno");
        E.setEmpno(S.nextInt());
        S.nextLine();
        System.out.println("Enter job");
        E.setJob(S.nextLine());
        System.out.println("Enter salary");
        E.setSal(S.nextInt());
        S.nextLine();
        System.out.println("Enter deptno");
        E.setDeptno(S.nextInt());
        S.nextLine();
        DBOperations.updateEmp(E);
         */
    }
}
