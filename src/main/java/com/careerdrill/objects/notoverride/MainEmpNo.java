package com.careerdrill.objects.notoverride;

import java.util.HashMap;
import java.util.Map;

public class MainEmpNo {
    public static void main(String[] args) {
        EmployeeNo emp1 = new EmployeeNo(11,"siva");
        EmployeeNo emp2 = new EmployeeNo(11,"siva");

        Map<EmployeeNo, String> hm = new HashMap<>();
        hm.put(emp1,"Bangalore");
        hm.put(emp2,"Mysore");

        System.out.println("Size : " + hm.size()) ;
    }
}
