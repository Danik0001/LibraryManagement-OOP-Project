package com.daniyal.library.service; // Ең басында осы тұруы шарт!

import com.daniyal.library.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

    public void insertOwner(String name, String phone, int pets) {
        String sql = "INSERT INTO people (name, phone, role, num_pets) VALUES (?, ?, 'Owner', ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setInt(3, pets);
            pstmt.executeUpdate();
            System.out.println("Owner saved successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllPeople() {
        String sql = "SELECT * FROM people";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " | Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePerson(int id) {
        String sql = "DELETE FROM people WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchByName(String name) {
        String sql = "SELECT * FROM people WHERE name ILIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Found: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}