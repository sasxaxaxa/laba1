package pack.lab11.ex4;

import java.util.*;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (от 1 до 12): ");
        int month = scanner.nextInt() - 1;

        System.out.print("Введите число: ");
        int dayOfMonth = scanner.nextInt();

        System.out.print("Введите часы (от 0 до 23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (от 0 до 59): ");
        int minutes = scanner.nextInt();

        System.out.print("Введите секунды (от 0 до 59): ");
        int second = scanner.nextInt();


        Date date = new Date(year - 1900, month, dayOfMonth, hours, minutes, second);


        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth, hours, minutes, second);


        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}