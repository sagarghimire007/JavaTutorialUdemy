package com.edureka_java_prerecorded_class;

import com.edureka_java_prerecorded_class.edureka_jdbc.ConnectionFactory;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class CallableStatementInJava {
    public static void main(String[] args) throws Exception {

        // make a connection to a database
        Connection con = ConnectionFactory.getConnection();
        CallableStatement cst = con.prepareCall("{call getAllEmployeeList}");
        cst.execute();
        ResultSet res = cst.getResultSet();
        while (res.next()) {
            System.out.println(res.getInt(1) + " | " + res.getString(2) + " | " + res.getFloat(3));
        }
        con.close();
        cst.close();
    }
}
