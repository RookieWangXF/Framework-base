package cn.rookie.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/info";
    private static final String USERNAME = "root";
    private static final String PASSWD = "root";
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";

    private Connection connection;

    public DatabaseConnection() {
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
