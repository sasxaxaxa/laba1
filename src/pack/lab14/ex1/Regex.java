package pack.lab14.ex1;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для манипуляции: ");
        String inputString = scanner.nextLine();

        String regex = "\\s+"; //выражение является регулярным выражением,
        // которое обозначает любое количество пробельных символов (пробел, табуляция, перенос строки и т. д.).

        String[] elements = inputString.split(regex);

        System.out.println("Элементы строки:");

        for (String element : elements) {
            System.out.println(element);
        }
    }
}