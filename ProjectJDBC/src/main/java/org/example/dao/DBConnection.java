package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection Con = null;
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
        return Con;
    }
}
