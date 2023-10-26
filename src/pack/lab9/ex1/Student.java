package pack.lab9.ex1;

public class Student {
    private String firstName;
    private String lastName;
    private int number;

    public Student(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                '}';
    }
}
