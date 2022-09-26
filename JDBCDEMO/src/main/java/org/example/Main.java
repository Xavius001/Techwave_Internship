package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection Con = null;
        PreparedStatement pstmt = null;

        Scanner S = new Scanner(System.in);
        System.out.println("Enter Empno");
        int empno = S.nextInt();
        S.nextLine();

        System.out.println("Enter Ename");
        String ename = S.nextLine();

        System.out.println("Enter gender");
        String gender = S.nextLine();

        System.out.println("Enter DOB");
        String db = S.nextLine();
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate dob = LocalDate.parse(db, D);

        System.out.println("Enter ssno");
        String ssno = S.nextLine();

        System.out.println("Enter doj");
        String dj = S.nextLine();
        LocalDate doj = LocalDate.parse(dj, D);

        System.out.println("Enter Email");
        String email = S.nextLine();

        System.out.println("Enter Deptno");
        int dno = S.nextInt();
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
            pstmt = Con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
            pstmt.setInt(1,empno);
            pstmt.setString(2,ename);
            pstmt.setString(3,gender);
            pstmt.setString(4, D.format(dob));
            pstmt.setString(5, ssno);
            pstmt.setString(6, D.format(doj));
            pstmt.setString(7, email);
            pstmt.setInt(8, dno);

            //step 4 execute
            int R = pstmt.executeUpdate();
            System.out.println(R + " rows inserted");

        } catch (SQLException e) {
            System.out.println("Statement "+e.getMessage());
        }

        //step 5 close the connection
        try {
            Con.close();
        } catch (SQLException e) {
            System.out.println("Connection closed "+e.getMessage());
        }
    }
}
