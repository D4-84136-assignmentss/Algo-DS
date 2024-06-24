package com.sunbeam;

public class EmployeeSearch {
    public Employee searchById(Employee[] employees, int empid) {
        for (Employee emp : employees) {
            if (emp.getEmpid() == empid) {
                return emp;
            }
        }
        return null;
    }

    public Employee searchByName(Employee[] employees, String name) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                return emp;
            }
        }
        return null;
    }

    public Employee searchBySalary(Employee[] employees, double salary) {
        for (Employee emp : employees) {
            if (emp.getSalary() == salary) {
                return emp;
            }
        }
        return null;
    }
}
