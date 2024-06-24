package com.sunbeam;

public class EmployeeSorter {
    private Employee[] employees;
    private int comparisons;

    public EmployeeSorter(Employee[] employees) {
        this.employees = employees;
        this.comparisons = 0;
    }

    public int sort() {
        for (int i = 1; i < employees.length; i++) {
            Employee key = employees[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element with a higher salary is found
            while (j >= 0) {
                comparisons++; // Count the comparison
                if (employees[j].getSalary() > key.getSalary()) {
                    employees[j + 1] = employees[j];
                    j--;
                } else {
                    break;
                }
            }
            employees[j + 1] = key;
        }
        return comparisons;
    }

    public Employee[] getSortedEmployees() {
        return employees;
    }
}
