package com.sunbeam;

public class main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "pooja", 50000),
            new Employee(2, "dhamma", 60000),
            new Employee(3, "sarthak", 70000),
            new Employee(4, "Aisha", 80000),
            new Employee(5, "snehal", 90000)
        };

        EmployeeSearch employeeSearch = new EmployeeSearch();

        // Search by empid
        int searchId = 3;
        Employee empById = employeeSearch.searchById(employees, searchId);
        if (empById != null) {
            System.out.println("Employee found by ID: " + empById);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Search by name
        String searchName = "pooja";
        Employee empByName = employeeSearch.searchByName(employees, searchName);
        if (empByName != null) {
            System.out.println("Employee found by Name: " + empByName);
        } else {
            System.out.println("Employee with Name " + searchName + " not found.");
        }

        // Search by salary
        double searchSalary = 60000;
        Employee empBySalary = employeeSearch.searchBySalary(employees, searchSalary);
        if (empBySalary != null) {
            System.out.println("Employee found by Salary: " + empBySalary);
        } else {
            System.out.println("Employee with Salary " + searchSalary + " not found.");
        }
    }
}
