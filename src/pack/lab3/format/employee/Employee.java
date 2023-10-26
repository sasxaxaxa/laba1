package pack.lab3.format.employee;

public class Employee {
    private final String fullname;
    private final double salary;

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
