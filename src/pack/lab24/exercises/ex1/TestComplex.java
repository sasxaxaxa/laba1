package pack.lab24.exercises.ex1;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        System.out.println("Enter int num:");
        try (Scanner sc = new Scanner(System.in)) {
            int real = sc.nextInt();
            int im = sc.nextInt();
            ConcreteFactory concreteFactory = new ConcreteFactory();
            Complex number = concreteFactory.CreateComplex(real, im);

            System.out.println("Complex number:" + number);
        }
    }
}