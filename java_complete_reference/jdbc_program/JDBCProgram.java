package com.java_complete_reference.jdbc_program;

import java.sql.*;

public class JDBCProgram {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlserver://SAGARGHIMIRE:1433;databaseName=customer;encrypt=true;trustServerCertificate=true;integratedSecurity=true";
        //making a connection
        try {
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String sqlStatement = "select * from customerDetails";
            ResultSet res = st.executeQuery(sqlStatement);
            while (res.next()) {
                String name = res.getString("name");
                String address = res.getString("address");
                Integer phoneNumber = res.getInt("phoneNumber");

                System.out.print("Name : " + name);
                System.out.print(", Address : " + address);
                System.out.print(", Phone Number : " + phoneNumber);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception Occurred");
        }
    }
}
