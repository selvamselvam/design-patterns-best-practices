package com.careerdrill.objects;

import com.careerdrill.objects.notoverride.EmployeeNo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EmployeeComparable {

    private static void sortEmployee(List<EmployeeNo> empList){
        Objects.requireNonNull(empList);
        empList.sort(Comparator.comparing(e -> e.getEmpID()));
        empList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        EmployeeNo  e1=new EmployeeNo(11,"aa");
        EmployeeNo  e2=new EmployeeNo(77,"ee");
        EmployeeNo  e3=new EmployeeNo(33,"cc");
        EmployeeNo  e4=new EmployeeNo(66,"dd");
        EmployeeNo  e5=new EmployeeNo(22,"bb");
        EmployeeNo  e6=new EmployeeNo(55,"hh");
        List<EmployeeNo> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);

        sortEmployee(empList);


    }
}
