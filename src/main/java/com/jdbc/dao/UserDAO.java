package com.jdbc.dao;

import com.jdbc.config.DatabaseConnection;
import com.jdbc.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserDAO {
    public void createUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.executeUpdate();
            System.out.println("User created successfully!");

        } catch (SQLException e) {
            System.out.println("Error creating user: " + e.getMessage());
        }
    }
}
