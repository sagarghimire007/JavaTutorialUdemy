package com.udemy.collection_in_java.map_in_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class EmployeeHash {
    String name;
    int id;

    EmployeeHash(String name , int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeHash that = (EmployeeHash) o;
        return id == that.id && Objects.equals(name , that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , id);
    }
}

public class HashCode {
    public static void main(String[] args) {

        EmployeeHash emp1 = new EmployeeHash("Sagar" , 1);
        EmployeeHash emp2 = new EmployeeHash("Sagar" , 1);
        EmployeeHash emp3 = new EmployeeHash("Nissan" , 1);

        System.out.println("Checking Equlas : " + emp1.equals(emp2));

        Map<EmployeeHash, Integer> map1 = new HashMap<EmployeeHash, Integer>();
        map1.put(emp1 , 1);
        System.out.println(emp1.hashCode());
        map1.put(emp2 , 2);
        System.out.println(emp2.hashCode());
        map1.put(emp3 , 3);
        System.out.println(emp3.hashCode());

        System.out.println(map1.size());
    }
}
