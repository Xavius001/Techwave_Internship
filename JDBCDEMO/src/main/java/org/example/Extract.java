package org.example;

import java.sql.*;
import java.util.Scanner;

public class Extract {

    public static void extract(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            int empno = resultSet.getInt("empno");
            String ename = resultSet.getString("ename");
            String job = resultSet.getString("job");
            int mgr = resultSet.getInt("mgr");
            String hiredate = resultSet.getDate("hiredate").toString();
            int sal = resultSet.getInt("sal");
            int comm = resultSet.getInt("comm");
            int deptno = resultSet.getInt("deptno");
            System.out.println(empno + "\t | \t" + ename + "\t | \t" + job + "\t | \t" + mgr + "\t | \t" + hiredate + "\t | \t" + sal + "\t | \t" + comm + "\t | \t" + deptno);
        }
    }

    public static void writeColumns() {
        System.out.println("empno \t | \t ename \t | \t job \t | \t mgr \t | \t hiredate \t | \t sal \t | \t comm \t | \t deptno");
    }

    public static void main(String[] args) {
        Connection Con = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;

        Scanner S = new Scanner(System.in);
        System.out.println("Enter deptno");
        int dno = S.nextInt();

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

            System.out.println("\nBefore Extraction");

            pstmt = Con.prepareStatement("Select * from emp");
            pstmt.executeQuery();
            extract(pstmt.getResultSet());

            System.out.println("\nAfter Extraction");

            pstmt = Con.prepareStatement("Select * from emp where deptno=?");
            pstmt.setInt(1,dno);
            pstmt.executeQuery();
            extract(pstmt.getResultSet());

            //step 4 execute
            int R = pstmt.executeUpdate();
            System.out.println(R + " rows extracted");


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
