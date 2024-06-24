import java.util.Arrays;

public class Company {
    private Employee[] employees;
    private int size; // to keep track of the number of employees in the array

    // Constructor
    public Company(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Method to add an employee to the company
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size] = emp;
            size++;
        } else {
            System.out.println("Cannot add more employees. Array is full.");
        }
    }

    // Method to search for an employee by empId
    public Employee findEmployeeById(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmpId() == empId) {
                return employees[i];
            }
        }
        return null; // return null if employee with given empId is not found
    }

    // Method to search for employees by name
    public Employee[] findEmployeesByName(String name) {
        Employee[] result = new Employee[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                result[count] = employees[i];
                count++;
            }
        }
        if (count > 0) {
            return Arrays.copyOf(result, count);
        } else {
            return null; // return null if no employees with given name are found
        }
    }

    // Method to search for employees by salary
    public Employee[] findEmployeesBySalary(double salary) {
        Employee[] result = new Employee[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() == salary) {
                result[count] = employees[i];
                count++;
            }
        }
        if (count > 0) {
            return Arrays.copyOf(result, count);
        } else {
            return null; // return null if no employees with given salary are found
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Company company = new Company(10); // create a company with capacity for 10 employees

        // Add\ some employees
        company.addEmployee(new Employee(1, "John Doe", 50000));
        company.addEmployee(new Employee(2, "Jane Smith", 60000));
        company.addEmployee(new Employee(3, "Michael Johnson", 55000));

        // Example searches
        System.out.println("Employee with ID 2: " + company.findEmployeeById(2));
        System.out.println("Employees with name 'John Doe': " + Arrays.toString(company.findEmployeesByName("John Doe")));
        System.out.println("Employees with salary 60000: " + Arrays.toString(company.findEmployeesBySalary(60000)));
    }
}
