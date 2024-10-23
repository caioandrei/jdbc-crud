package com.jdbc.config;

import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {

        Connection connection = DatabaseConnection.getConnection();

        DatabaseConnection.closeConnection(connection);
    }
}
