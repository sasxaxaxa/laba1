package pack.lab13.ex2;

public class Person {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(surname);
        if (name != null && !name.isEmpty()) {
            fullName.append(" ").append(name.charAt(0)).append(".");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(" ").append(patronymic.charAt(0)).append(".");
        }
        return fullName.toString();
    }
}