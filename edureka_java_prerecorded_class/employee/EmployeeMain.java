package com.edureka_java_prerecorded_class.employee;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) throws Exception {

        EmployeeDAO edao = DAOFactory.getEmployeeDAO();

        //save employee
//        Employee emp = new Employee(101 , "Sagar Ghimire" , 999.56f);
//        edao.saveEmp(emp);

        // update employee
//        Employee emp = new Employee(106 , "Sunil Joseph" , 999.56f);
//        edao.updateEmp(emp);

        //delete the employee
//        edao.deleteEmp(109);

        // search an employee
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Search Employee with empno : ");
//        int eno = scanner.nextInt();
//        Employee emp = edao.searchEmp(eno);
//        if (emp != null) {
//            System.out.println(emp);
//        } else {
//            System.out.println("No Matching Employee Found");
//        }


        // list of employees
        List<Employee> empList = edao.getEmployees();
        for (Employee ep : empList) {
            System.out.println(ep);
        }
//        scanner.close();
    }
}
