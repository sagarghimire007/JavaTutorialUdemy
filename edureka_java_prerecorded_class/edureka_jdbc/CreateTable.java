package com.edureka_java_prerecorded_class.edureka_jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception {

        Connection con = ConnectionFactory.getConnection();
        Statement st = con.createStatement();
        String sql = "create table emp (empno int, ename nvarchar(100), sal decimal(10,2), primary key(empno))";

        try {
            st.execute(sql);
            System.out.println("DB Table created");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        st.close();
        con.close();
    }
}
