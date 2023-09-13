package pack.lab3.format.employee;

import java.util.ArrayList;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String getFullname() {
        return fullname;
    }

}
