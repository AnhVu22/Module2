package services;

import model.Person.Customer;

public interface ICustomerService extends Service{
    void addCustomer(Customer customer);
    void displayCustomer();
}
