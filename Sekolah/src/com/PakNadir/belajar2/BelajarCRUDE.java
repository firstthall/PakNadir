package com.PakNadir.belajar2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BelajarCRUDE {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:33060/test";
        String dbUser = "root@localhost";
        String dbPassword = "ATHA";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            System.out.println("Connected to MySQL successfully!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL: " + e.getMessage());

        }
    }
}