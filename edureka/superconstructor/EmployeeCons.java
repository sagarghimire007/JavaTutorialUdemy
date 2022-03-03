package com.edureka.superconstructor;



public class EmployeeCons extends PersonCons {
    int eId;
    EmployeeCons(){
        super();
    }

    EmployeeCons(String name, int id){
        super(name);
        this.eId = id;
    }

    public void display(){
        System.out.println("Ename : "+name);
        System.out.println("Eid : "+eId);
    }

    public static void main(String[] args) {
        EmployeeCons e1 = new EmployeeCons();
        EmployeeCons e = new EmployeeCons("Sagar", 1);
        e.display();
    }
}
