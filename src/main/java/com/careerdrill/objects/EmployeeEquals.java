package com.careerdrill.objects;

public class EmployeeEquals {

    private String empName;
    private int empID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEquals employee = (EmployeeEquals) o;
        return empID == employee.empID && empName.equals(employee.empName);
    }


}
