package pack.lab4.lab41.person3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("sasha", 19);
        Person person2 = new Person("ilya", 20);

        Person person3 = new Person();


        ArrayList<Person> array = new ArrayList<>();

        array.add(person1);
        array.add(person2);
        array.add(person3);

        for (Person person : array) {
            person.talk(person);


        }

    }
}
