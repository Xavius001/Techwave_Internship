package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Update {

    public static void extract(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            int empno = resultSet.getInt("empno");
            String ename = resultSet.getString("ename");
            String gender = resultSet.getString("gender");
            String dob = resultSet.getDate("dob").toString();
            int ssno = resultSet.getInt("ssno");
            String doj = resultSet.getDate("doj").toString();
            String email = resultSet.getString("email");
            int deptid = resultSet.getInt("deptid");
            System.out.println(empno + "\t | \t" + ename + "\t | \t" + gender + "\t | \t" + dob + "\t | \t" + ssno + "\t | \t" + doj + "\t | \t" + email + "\t | \t" + deptid);
        }
    }

    public static void main(String[] args) {
        Connection Con = null;
        PreparedStatement pstmt = null;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter Deptid");
        int dno = S.nextInt();
        S.nextLine();

        System.out.println("Enter Email");
        String email = S.nextLine();

        System.out.println("Enter Empno");
        int empno = S.nextInt();

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
            System.out.println("\nBefore update");

            pstmt = Con.prepareStatement("Select * from employee");
            pstmt.executeQuery();
            extract(pstmt.getResultSet());

            //Update
            pstmt = Con.prepareStatement("Update employee set deptid=?,email=? Where empno=?");
            pstmt.setInt(1,dno);
            pstmt.setString(2,email);
            pstmt.setInt(3,empno);

            //step 4 execute
            int R = pstmt.executeUpdate();
            System.out.println("\nAfter update");
            pstmt = Con.prepareStatement("Select * from employee");
            pstmt.executeQuery();
            extract(pstmt.getResultSet());
            System.out.println(R + " row updated");

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
