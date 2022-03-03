package com.edureka_java_prerecorded_class.employee;

import com.edureka_java_prerecorded_class.edureka_jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImplementation implements EmployeeDAO {

    private Connection con;
    private Statement st;

    public EmployeeDAOImplementation() throws Exception {
        con = ConnectionFactory.getConnection();
        st = con.createStatement();
    }

    @Override
    public void saveEmp(Employee emp) throws Exception {
        String sql = "insert into emp values(" + emp.getEmpno() + ",'" + emp.getEname() + "' ," + emp.getSal() + ")";
        int n = st.executeUpdate(sql);
        if (n > 0) {
            System.out.println("employee saved");
        }

    }

    @Override
    public void updateEmp(Employee emp) throws Exception {
        String sql = "update emp set ename = '" + emp.getEname() + "', sal = " + emp.getSal() + " where empno = " + emp.getEmpno() + "";
        int n = st.executeUpdate(sql);
        if (n > 0) {
            System.out.println("employee updated");
        }
    }

    @Override
    public void deleteEmp(int eno) throws Exception {
        String sql = "delete from emp where empno=" + eno;
        int n = st.executeUpdate(sql);
        if (n > 0) {
            System.out.println("Employee deleted");
        } else {
            System.out.println("No Matching employee to delete");
        }
    }

    @Override
    public Employee searchEmp(int eno) throws Exception {
        Employee emp = null;
        String sql = "select ename,sal from emp where empno = " + eno;
        ResultSet res = st.executeQuery(sql);
        if (res.next()) {
            String name = res.getString(1);
            float sal = res.getFloat(2);
            emp = new Employee(eno , name , sal);
        }
        return emp;
    }

    @Override
    public List<Employee> getEmployees() throws Exception {

        List<Employee> emps = new ArrayList<Employee>();

        String sql = "select * from emp";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            int eno = rs.getInt(1);
            String name = rs.getString(2);
            float sal = rs.getFloat(3);
            Employee emp = new Employee(eno , name , sal);
            emps.add(emp);
        }
        return emps;
    }
}
