package com.daniyal.library.service;


import com.daniyal.library.model.Owner;
import com.daniyal.library.model.Person;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LibraryDAO {


    public boolean insertOwner(String name, String phone, int pets) {

        String sql = """
                INSERT INTO people (name, phone, role, num_pets)
                VALUES (?, ?, 'Owner', ?)
                """;

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return false;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, pets);

            stmt.executeUpdate();
            System.out.println("✅ Owner inserted into database");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        } finally {
            DatabaseConnection.close(connection);
        }
    }


    public List<Person> getAllPeople() {

        String sql = "SELECT * FROM people ORDER BY id";
        List<Person> people = new ArrayList<>();

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return people;

        try (
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            System.out.println("\n--- PEOPLE FROM DATABASE ---");

            while (rs.next()) {
                Person p = new Owner(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getInt("num_pets")
                );
                people.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DatabaseConnection.close(connection);
        }

        return people;
    }

    public Person getPersonById(int id) {

        String sql = """
                SELECT * FROM people
                WHERE id = ?
                """;

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Owner(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getInt("num_pets")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DatabaseConnection.close(connection);
        }

        return null;
    }


    public boolean updatePerson(int id, String name, String phone, int pets) {

        String sql = """
                UPDATE people
                SET name = ?, phone = ?, num_pets = ?
                WHERE id = ?
                """;

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return false;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, pets);
            stmt.setInt(4, id);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        } finally {
            DatabaseConnection.close(connection);
        }
    }


    public boolean deletePerson(int id) {

        String sql = """
                DELETE FROM people
                WHERE id = ?
                """;

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return false;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;

        } finally {
            DatabaseConnection.close(connection);
        }
    }


    public List<Person> searchByName(String keyword) {

        String sql = """
                SELECT * FROM people
                WHERE name ILIKE ?
                """;

        List<Person> results = new ArrayList<>();

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return results;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- SEARCH RESULT ---");

            while (rs.next()) {
                Person p = new Owner(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getInt("num_pets")
                );
                results.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DatabaseConnection.close(connection);
        }

        return results;
    }


    public List<Person> searchByPets(int pets) {

        String sql = """
                SELECT * FROM people
                WHERE num_pets = ?
                """;

        List<Person> results = new ArrayList<>();

        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) return results;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, pets);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- SEARCH RESULT ---");

            while (rs.next()) {
                Person p = new Owner(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getInt("num_pets")
                );
                results.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DatabaseConnection.close(connection);
        }

        return results;
    }
}
