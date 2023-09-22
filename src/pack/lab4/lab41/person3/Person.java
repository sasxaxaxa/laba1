package pack.lab4.lab41.person3;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(Person person) {

    }

    public void talk(Person person) {
        System.out.printf("%s возрастом %d говорит\n", fullName, age);
    }

    public Person() {

    }
}
