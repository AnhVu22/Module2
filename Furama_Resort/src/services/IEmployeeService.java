package services;

import model.Person.Employee;

public interface IEmployeeService extends Service{
    @Override
    default void displayInfo() {

    }

    @Override
    default void addNew() {

    }

    @Override
    default void edit() {

    }

    @Override
    default void delete() {

    }
}
