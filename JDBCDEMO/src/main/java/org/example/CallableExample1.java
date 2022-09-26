package org.example;

import java.sql.*;
import java.util.Scanner;

public class CallableExample1 {
    public static void main(String[] args) {
        Connection Con = null;
        CallableStatement cstmt = null;
        Scanner s = new Scanner(System.in);
        int eno  = s.nextInt();
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

        try {
            cstmt = Con.prepareCall("{call sp_update(?,?)}");
            cstmt.setInt(1,eno);
            cstmt.registerOutParameter(2, Types.VARCHAR, 25);
            cstmt.execute();
            System.out.println(cstmt.getString(2));

        } catch (SQLException e) {
            System.out.println("Error"+e.getMessage());
        }

        try {
            Con.close();
        } catch (SQLException e) {
            System.out.println("Connection closed "+e.getMessage());
        }
    }
}
