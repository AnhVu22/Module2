package services.impl;

import model.Person.Employee;
import services.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
    }
    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void displayListEmployee(String employee) {

    }

    @Override
    public void editEmployee(String employee) {

    }

    @Override
    public void displayInfo() {

    }
}
