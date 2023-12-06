package pack.lab24.exercises.ex2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 -> MagicChair; 2 -> VictorianChair; 3 -> FunctionalChair");
            String type = sc.nextLine();
            switch (type) {
                case ("1"): {
                    MagicChair chair = new MagicChair();
                    chair.doMagic();
                    break;
                }
                case ("2"): {
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    VictorianChair chair = new VictorianChair(age);
                    System.out.println(chair.toString());
                    break;
                }
                case ("3"): {
                    FunctionalChair chair = new FunctionalChair();
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum: " + chair.sum(a, b));
                    break;
                }
            }
        }
    }
}
