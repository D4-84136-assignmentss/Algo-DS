package com.sunbeam;

public class Employee {
    int empId;
    String name;
    double salary;
    Employee next;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.next = null;
    }
}
