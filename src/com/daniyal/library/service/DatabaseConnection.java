package com.daniyal.library.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // OPP - база аты, asik1 - пароль (сенің скриншотың бойынша)
    private static final String URL = "jdbc:postgresql://localhost:5432/OPP";
    private static final String USER = "postgres";
    private static final String PASS = "gangout07";

    public static Connection getConnection() throws SQLException {
        // Базамен байланыс орнату
        return DriverManager.getConnection(URL, USER, PASS);
    }
}