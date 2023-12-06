package pack.lab13.ex2;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Симаева", "Александра", "Вячеславовна");

        String fullName = person.getFullName();
        System.out.println(fullName);
    }
}