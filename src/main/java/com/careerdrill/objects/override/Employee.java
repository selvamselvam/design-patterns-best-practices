package com.careerdrill.objects.override;

public class Employee {
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private String empName;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    private int empID;

    public Employee(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID && empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empID);
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                '}';
    }
}
