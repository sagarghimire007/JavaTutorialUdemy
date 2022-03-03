package com.udemy.object_oriented_programming_again.step07inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employeeGrade;
    private BigDecimal salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Employee Title = " + getTitle() + ", Employee Grade = " + getEmployeeGrade() + ", Employee Salary = " + getSalary();
    }
}
