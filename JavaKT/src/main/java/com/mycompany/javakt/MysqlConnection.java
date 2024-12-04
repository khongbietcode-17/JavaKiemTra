/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author To Trung Tin
 */
public class MysqlConnection {
    private final static String username = "root";
    private final static String password = "";
    private final static String connectionURL = "jdbc:mysql://localhost/javadb";
    
    public static Connection createConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
           System.out.println(e.getMessage());
        }

        return conn;
    }
  
}
