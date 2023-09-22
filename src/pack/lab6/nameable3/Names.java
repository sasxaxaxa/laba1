package pack.lab6.nameable3;

import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        final ArrayList<Nameable> names = new ArrayList<>();

        Planet saturn = new Planet("Saturn");
        Planet earth = new Planet("Earth");

        Pet barsik = new Pet("Barsik", "American");
        Pet brus = new Pet("Brus", "Hungerian Vyzhla");

        Person sasha = new Person("Sasha", "Aaa");

        Car car = new Car("BMW", "X7");

        names.add(saturn);
        names.add(earth);
        names.add(barsik);
        names.add(brus);
        names.add(sasha);
        names.add(car);

        for (Nameable nameable : names) {
            System.out.println(nameable.toString());
            System.out.println(nameable.name());
        }

    }
}
