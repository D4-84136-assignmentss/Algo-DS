package com.sunbeam;

import java.util.Scanner;

public class EmployeeLinkedList {
    private Employee head;

    public EmployeeLinkedList() {
        this.head = null;
    }

    // Add a new employee at the end of the list
    public void addEmployee(int empId, String name, double salary) {
        Employee newEmployee = new Employee(empId, name, salary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEmployee;
        }
    }

    // Display all employees
    public void displayAllEmployees() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }
        Employee current = head;
        while (current != null) {
            System.out.println("Employee ID: " + current.empId + ", Name: " + current.name + ", Salary: " + current.salary);
            current = current.next;
        }
    }

    // Search employee by name
    public Employee searchEmployeeByName(String name) {
        Employee current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Delete employee by empId
    public void deleteEmployeeById(int empId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.empId == empId) {
            head = head.next;
            return;
        }
        Employee current = head;
        Employee prev = null;
        while (current != null && current.empId != empId) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Employee not found.");
            return;
        }
        prev.next = current.next;
    }

    // Update salary of employee by empId
    public void updateSalary(int empId, double newSalary) {
        Employee current = head;
        while (current != null) {
            if (current.empId == empId) {
                current.salary = newSalary;
                return;
            }
            current = current.next;
        }
        System.out.println("Employee not found.");
    }
}
