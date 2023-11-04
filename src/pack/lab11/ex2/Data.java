package pack.lab11.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date userDate = null;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
            String userInput = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            userDate = dateFormat.parse(userInput);
        } catch (java.text.ParseException e) {
            System.out.println("Неверный формат даты!");
            System.exit(1);
        }

        if (userDate.equals(currentDate)) {
            System.out.println("Введенная дата совпадает");
        } else if (userDate.before(currentDate)) {
            System.out.println("Введенная дата меньше");
        } else {
            System.out.println("Введенная дата больше");
        }
    }
}