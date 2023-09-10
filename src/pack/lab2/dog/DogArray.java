package pack.lab2.dog;
import java.util.Scanner;
import java.util.ArrayList;

public class DogArray {
    public static void main(String[] args) {
        ArrayList<Dog> dogArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество собак: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите имя собаки: ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст собаки: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Dog dog = new Dog(name, age);
            dogArray.add(dog);
        }
        System.out.println("Собаки: ");
        for (Dog dog : dogArray) {
            System.out.println("Собака по кличке " + dog.getName() + ", возраст: "
                    + dog.getAge() + ", возраст в человеческих годах: " + dog.toHumanAge());
        }
    }
}