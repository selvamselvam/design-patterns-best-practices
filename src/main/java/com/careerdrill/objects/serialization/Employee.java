package com.careerdrill.objects.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -6051857159152944129L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    private int empID;

    public Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }


}
