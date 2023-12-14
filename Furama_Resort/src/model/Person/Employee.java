package model.Person;

import java.util.Date;
import java.util.TreeMap;

public class Employee extends Person {
    public static TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();
    private String level;
    private String title;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String title, int salary) {
        this.level = level;
        this.title = title;
        this.salary = salary;
    }

    public Employee(String id, String name, Date dateOfBirth, String gender, int idNumber, int phoneNumber, String emailAddress, String level, String title, int salary) {
        super(id, name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.level = level;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String showInfo() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
