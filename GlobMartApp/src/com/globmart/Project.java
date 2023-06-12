package com.globmart;

import java.util.List;

public class Project {   private String pcode;
    private String project_name;
    private List<Employee> employees;

    public Project(String pcode, String project_name, List<Employee> employees) {
        this.pcode = pcode;
        this.project_name = project_name;
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Project [pcode=" + pcode + ", project_name=" + project_name + ", employees=" + employees + "]";
    }
}


