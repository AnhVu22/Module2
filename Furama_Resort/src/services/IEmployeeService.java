package services;

import model.Person.Employee;

public interface IEmployeeService extends Service{
    void addEmployee(Employee employee);
    void displayListEmployee(String employee);
    void editEmployee(String employee);
}
