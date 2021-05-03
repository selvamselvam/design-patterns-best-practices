package com.careerdrill.objects.notoverride;

public class EmployeeNo {
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    private String empName;

    @Override
    public String toString() {
        return "EmployeeNo{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                '}';
    }

    private int empID;

    public EmployeeNo(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }

}
