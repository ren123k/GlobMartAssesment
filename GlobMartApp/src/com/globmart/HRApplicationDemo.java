package com.globmart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HRApplicationDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Roger", "UK", 1));
        employees.add(new Employee(102, "Sam", "India", 3));
        employees.add(new Employee(103, "Xiang", "China", 7));
        employees.add(new Employee(104, "Willey", "US", 4));
        employees.add(new Employee(105, "Jane", "India", 20));

        displayEmployees(employees);
        sortByCountry(employees);
        sortById(employees);
        createLists(employees);
        addProjectDetails();
    }

//  Requirement 1:  Adding Employee

    public static void addEmployee(List<Employee> employees, Employee employee) {
        employees.add(employee);
    }

    // Requirement 1:  Display  Employee
    public static void displayEmployees(List<Employee> employees) {
        System.out.println("Employee Profiles:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }


    // Requirement 2: Sorting by Country Using comparator

    public static void sortByCountry(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getEmmployeeWorkLocation));
        System.out.println("Sorted Employees by Country:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }


    // Requirement 3:  Sorting by ID Using Java 8 features

    public static void sortById(List<Employee> employees) {
        employees.stream()
                .filter(employee -> employee.getEmployeeYearsOfExperience() < 1)
                .sorted(Comparator.comparing(Employee::getEmployeeId))
                .map(Employee::getEmployeeId)
                .forEach(System.out::println);
        System.out.println();
    }


    // Requirement 4: createList method that prints two separate list using Java 8 features


    public static void createLists(List<Employee> employees) {
        System.out.println("Employees with Even Numbers:");
        employees.stream()
                .filter(employee -> employee.getEmployeeId() % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Employees with Odd Numbers:");
        employees.stream()
                .filter(employee -> employee.getEmployeeId() % 2 != 0)
                .forEach(System.out::println);
        System.out.println();
    }

    // Requirement 5: addProjectdetails and  prints the same- use Latest features of Java

    public static void addProjectDetails() {
        Employee e1 = new Employee(101, "Roger", "UK", 1);
        Employee e2 = new Employee(102, "Sam", "India", 3);
        Employee e3 = new Employee(103, "Xiang", "China", 7);

        Project project = new Project("p101", "Anaplan", new ArrayList<>());
        project.addEmployee(e1);
        project.addEmployee(e2);
        project.addEmployee(e3);

        System.out.println("Project Details:");
        System.out.println(project);
    }
}
