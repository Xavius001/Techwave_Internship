package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SQLAssignment2 {
    public static void main(String[] args) {
        Connection Con = null;
        CallableStatement cstmt = null;
        Scanner S = new Scanner(System.in);

        /*Question 1 Input
        System.out.println("Enter empno");
        int empno = S.nextInt();
        S.nextLine();

        System.out.println("Enter ename");
        String ename = S.nextLine();

        System.out.println("Enter job");
        String job = S.nextLine();

        System.out.println("Enter mgr");
        int mgr = S.nextInt();
        S.nextLine();

        System.out.println("Enter hiredate");
        String hd = S.nextLine();
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate hiredate = LocalDate.parse(hd, D);

        System.out.println("Enter sal");
        int sal = S.nextInt();
        S.nextLine();

        System.out.println("Enter comm");
        int comm = S.nextInt();
        S.nextLine();

        System.out.println("Enter deptno");
        int deptno = S.nextInt();
        S.nextLine();
         */

        //Question 2 Input
        System.out.println("Enter sal");
        int sal = S.nextInt();
        S.nextLine();

        System.out.println("Enter job");
        String job = S.nextLine();

        System.out.println("Enter empno");
        int empno = S.nextInt();
        S.nextLine();

        //step 1 - specify the driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Message "+e.getMessage());
        }

        //step 2 - Specify the URL (IP Address/DB Name/Username/Password)
        try {
            Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ChickenTech1998");
        } catch (SQLException e) {
            System.out.println("URL "+e.getMessage());
        }

        //step 3 - Create statement
        try {
            //calls the addRow method and matches the parameters with same name as the arguments
            /* Question 1 Output
            cstmt = Con.prepareCall("{call addRow(?,?,?,?,?,?,?,?,?)}");
            //argument names (for parameter names check the procedure)
            cstmt.setInt(1,empno);
            cstmt.setString(2,ename);
            cstmt.setString(3,job);
            cstmt.setInt(4,mgr);
            cstmt.setString(5, D.format(hiredate));
            cstmt.setInt(6, sal);
            cstmt.setInt(7, comm);
            cstmt.setInt(8, deptno);
            cstmt.registerOutParameter(9, Types.VARCHAR, 25);
            cstmt.execute();
            //outputs the status from the procedure (status out varchar2)
            System.out.println(cstmt.getString(9));
             */

            //Question 2 Output
            //call updaterow and matches the parameters with the same name as the arguments
            cstmt = Con.prepareCall("{call updateRow(?,?,?,?)}");

            //argument names (for parameter names check the procedure)
            cstmt.setInt(1, sal);
            cstmt.setString(2,job);
            cstmt.setInt(3, empno);
            cstmt.registerOutParameter(4, Types.VARCHAR, 25);
            cstmt.execute();
            //outputs the status from the procedure (status out varchar2)
            System.out.println(cstmt.getString(4));


        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        }

        //step 5 close the connection
        try {
            Con.close();
        } catch (SQLException e) {
            System.out.println("Connection closed "+e.getMessage());
        }
    }
}
