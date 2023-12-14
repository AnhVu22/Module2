package services.impl;

import model.Person.Customer;
import services.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private List<Customer> customers;

    public CustomerService() {
    }

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void displayCustomer() {

    }

    @Override
    public void displayInfo() {

    }
}
