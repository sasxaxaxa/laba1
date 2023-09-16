package pack.lab41.Employer;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Employer> array = new ArrayList<>();
        Employer employer = new Employer("Sasha", "Simaeva", 100000);
        Manager manager = new Manager("Kirill", "Ivanov", 100000);
        Employer employer1 = new Employer("A", "aa", 200);
        Manager manager1 = new Manager("B", "b", 200);

        array.add(employer);
        array.add(manager);
        array.add(employer1);
        array.add(manager1);

        for (Employer employers : array) {
            System.out.println(employers.toString());
        }
    }
}