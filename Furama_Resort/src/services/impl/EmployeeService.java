package services.impl;

import model.Person.Employee;
import services.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    @Override
    public void displayInfo() {
        IEmployeeService.super.displayInfo();
    }

    @Override
    public void addNew() {
        IEmployeeService.super.addNew();
    }

    @Override
    public void edit() {
        IEmployeeService.super.edit();
    }

    @Override
    public void delete() {
        IEmployeeService.super.delete();
    }
}
