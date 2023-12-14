package repository.impl;

import model.Person.Customer;
import model.Person.Employee;
import repository.IEmployeeRepository;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FILE_PATH = "data/Employees.csv";
    private List<Employee> employees;
    public EmployeeRepository() {
        // Load data from the file to initialize the list
        // Implement file reading logic
        employees = loadDataFromFile(FILE_PATH);
    }

    public EmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setCustomers(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
        // Implement file writing logic to save the updated list
        savaDataToFile(FILE_PATH, employees);
    }

    @Override
    public void displayAll() {
        // Implement logic to display all employees
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
