package com.edureka_java_prerecorded_class.employee;

public class DAOFactory {
    public static EmployeeDAO dao = null;

    public static EmployeeDAO getEmployeeDAO() throws Exception {
        EmployeeDAO dao = new EmployeeDAOImplementation();
        return dao;
    }
}
