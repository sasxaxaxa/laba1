package pack.lab4.lab41.employer6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;
    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public double getIncome() {
        return income;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", income=" + getIncome() +
                '}';
    }
}


class Manager extends Employer {
    public Manager(String firstName, String lastName, double income) {
        super(firstName, lastName, income);
        double averageSum = income / 20;
        this.income = income + averageSum * 12;
    }

    final private double income;

    @Override
    public double getIncome() {
        return income;
    }
}