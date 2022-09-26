package org.example;

import oracle.jdbc.OracleTypes;
import oracle.jdbc.internal.XSCacheOutput;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SelectExample {
    public static void main(String[] args) {
        Connection Con = null;
        CallableStatement cstmt = null;
        Scanner S = new Scanner(System.in);
        //System.out.println("Enter deptno");
        //int dno = S.nextInt();
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate L = LocalDate.parse(S.nextLine(), D);

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
            cstmt = Con.prepareCall("{call sp_selectemp(?, ?)}");
            cstmt.setString(1, D.format(L));
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet Rs = (ResultSet) cstmt.getObject(2);
            while(Rs.next()) {
                System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            Con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
