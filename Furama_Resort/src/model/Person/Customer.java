package model.Person;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person {
    public ArrayList<Customer> customerArrayList = new ArrayList<>();
    private String classCustomer;
    private String address;

    public Customer() {
    }

    public Customer(ArrayList<Customer> customerArrayList, String classCustomer, String address) {
        this.customerArrayList = customerArrayList;
        this.classCustomer = classCustomer;
        this.address = address;
    }

    public Customer(String id, String name,
                    Date dateOfBirth, String gender,
                    int idNumber, int phoneNumber,
                    String emailAddress, ArrayList<Customer> customerArrayList,
                    String classCustomer, String address) {
        super(id, name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.customerArrayList = customerArrayList;
        this.classCustomer = classCustomer;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", classCustomer='" + classCustomer + '\'' +
                ", address='" + address + '\'' +
                "customerArrayList=" + customerArrayList +
                '}';
    }
}
