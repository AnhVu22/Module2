package repository.impl;

import model.Person.Customer;
import repository.ICustomerRepository;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customers;

    public CustomerRepository() {
    }

    public CustomerRepository(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void add(Customer item) {

    }

    @Override
    public void displayAll() {

    }
}
