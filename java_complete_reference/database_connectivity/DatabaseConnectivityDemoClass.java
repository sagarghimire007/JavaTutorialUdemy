package com.java_complete_reference.database_connectivity;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivityDemoClass {
    /*
    1. import package (java.sql package
    2. load and register the driver
    3. create a connection
    4. create a statement
    5. execute the query
    6. process the results
    7. close
     */
    public static void main(String[] args) throws SQLException {
        try {
//            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SAGARGHIMIRE:1433");

//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String userName = "SAGARGHIMIRE\\sagar";
//            String password = "722282";

            String connectionUrl = "jdbc:sqlserver://SAGARGHIMIRE:1433;databaseName=customer;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
            Connection con = DriverManager.getConnection(connectionUrl);

            DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

