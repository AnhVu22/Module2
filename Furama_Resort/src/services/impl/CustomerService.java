package services.impl;

import services.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Override
    public void displayInfo() {
        ICustomerService.super.displayInfo();
    }

    @Override
    public void addNew() {
        ICustomerService.super.addNew();
    }

    @Override
    public void edit() {
        ICustomerService.super.edit();
    }

    @Override
    public void delete() {
        ICustomerService.super.delete();
    }
}
