package com.java_complete_reference.jdbc_program;


/*
insert into database and retrieve the data from the database
 */

import java.sql.*;

public class JDBCProgram2 {
    public static void main(String[] args) {

        String url = "jdbc:sqlserver://SAGARGHIMIRE:1433;databaseName = customer; encrypt = true;trustServerCertificate=true;" + "integratedSecurity=true";
        try {
            Connection con = DriverManager.getConnection(url); // making connection

            // inserting data to the database

//            String query = "insert into customerDetails values('Amar Sapkota','Melamchu',9843)";
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setString(1 , "Anu");
//            preparedStatement.setString(2 , "Chabahil");
//            preparedStatement.setInt(3 , 9860);
//            preparedStatement.executeUpdate();

            // selecting data from the database.... using the Statement interface and executeQuery();
            String query = "select * from customerDetails";
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query);
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
            e.printStackTrace();
        }
    }
}
