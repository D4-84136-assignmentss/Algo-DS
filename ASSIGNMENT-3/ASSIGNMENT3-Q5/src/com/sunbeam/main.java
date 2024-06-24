package com.sunbeam;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employeeList.addEmployee(empId, name, salary);
                    break;
                case 2:
                    employeeList.displayAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee Name: ");
                    String searchName = scanner.nextLine();
                    Employee employee = employeeList.searchEmployeeByName(searchName);
                    if (employee != null) {
                        System.out.println("Employee ID: " + employee.empId + ", Name: " + employee.name + ", Salary: " + employee.salary);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteEmpId = scanner.nextInt();
                    employeeList.deleteEmployeeById(deleteEmpId);
                    break;
                case 5:
                    System.out.print("Enter Employee ID to update salary: ");
                    int updateEmpId = scanner.nextInt();
                    System.out.print("Enter new Salary: ");
                    double newSalary = scanner.nextDouble();
                    employeeList.updateSalary(updateEmpId, newSalary);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
