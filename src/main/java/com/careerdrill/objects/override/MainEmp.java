package com.careerdrill.objects.override;

import java.util.HashMap;
import java.util.Map;

public class MainEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(11,"siva");
        Employee emp2 = new Employee(11,"siva");

        Map<Employee, String> hm = new HashMap<>();
        hm.put(emp1,"Bangalore");
        hm.put(emp2,"Mysore");

        System.out.println("Size : " + hm.size()) ;


    }
}
