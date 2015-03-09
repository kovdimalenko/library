package com.kov.library.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Дима on 09.03.15.
 */
public class EntityManager {

    private static final String USER = "root";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users";
    private static final String PASS = "1705";

    public Connection getConnection() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
