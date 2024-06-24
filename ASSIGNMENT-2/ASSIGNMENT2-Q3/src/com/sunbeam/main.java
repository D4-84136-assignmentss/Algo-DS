package com.sunbeam;

public class main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("snehal", 50000),
            new Employee("shivaji", 70000),
            new Employee("kalpana", 60000),
            new Employee("dhamma", 45000),
            new Employee("sai", 80000)
        };

        // Create an instance of EmployeeSorter
        EmployeeSorter sorter = new EmployeeSorter(employees);

        // Sort the employees by salary and get the number of comparisons
        int comparisons = sorter.sort();

        // Get the sorted array of employees
        Employee[] sortedEmployees = sorter.getSortedEmployees();

        // Print the sorted array of employees
        System.out.println("Employees sorted by salary:");
        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }

        // Print the number of comparisons
        System.out.println("Number of comparisons: " + comparisons);
    }
}
