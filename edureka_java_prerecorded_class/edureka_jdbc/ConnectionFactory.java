package com.edureka_java_prerecorded_class.edureka_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
    public static Connection con = null;

    public static Connection getConnection() throws Exception {
        if (con == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("com/dbConfig");
            String url = bundle.getString("url");
            con = DriverManager.getConnection(url); // making connection to the database
        }
        return con;
    }
}
