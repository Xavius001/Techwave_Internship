package org.example;

import java.sql.*;
import java.util.Scanner;

public class Delete {

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


            System.out.println("\nBefore deletion");
            pstmt = Con.prepareStatement("select * from employee");
            pstmt.executeQuery();
            extract(pstmt.getResultSet());

            pstmt = Con.prepareStatement("Delete from employee where empno=?");
            pstmt.setInt(1,empno);

            //step 4 execute
            int R = pstmt.executeUpdate();
            System.out.println("\nAfter deletion");
            pstmt = Con.prepareStatement("select * from employee");
            pstmt.executeQuery();
            extract(pstmt.getResultSet());
            System.out.println(R + " row deleted");

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
