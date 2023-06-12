package com.globmart;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String emmployeeWorkLocation;
    private int employeeYearsOfExperience;

    public Employee(int employeeId, String employeeName, String emmployeeWorkLocation, int employeeYearsOfExperience) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.emmployeeWorkLocation = emmployeeWorkLocation;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmmployeeWorkLocation() {
        return emmployeeWorkLocation;
    }

    public void setEmmployeeWorkLocation(String emmployeeWorkLocation) {
        this.emmployeeWorkLocation = emmployeeWorkLocation;
    }

    public int getEmployeeYearsOfExperience() {
        return employeeYearsOfExperience;
    }

    public void setEmployeeYearsOfExperience(int employeeYearsOfExperience) {
        this.employeeYearsOfExperience = employeeYearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", emmployeeWorkLocation='" + emmployeeWorkLocation + '\'' +
                ", employeeYearsOfExperience=" + employeeYearsOfExperience +
                '}';
    }
}

