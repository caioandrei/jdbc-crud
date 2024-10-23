package com.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_project";
    private static final String USER = "root";
    private static final String PASSWORD = "CaioFlu.2002";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to the database established successfully.");
        } catch (SQLException e) {
            System.err.println("Error while connecting to the database: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                System.err.println("Error while closing the connection: " + e.getMessage());
            }
        }
    }
}
