package com.careerdrill.objects;

import java.util.Objects;

public class EmployeeHash {

    private String empName;
    private int empID;


    @Override
    public int hashCode() {
        return Objects.hash(empName, empID);
    }
}
