package pack.lab19.ex1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fullName;
        String inn;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            fullName = sc.nextLine();

            System.out.print("Введите ИНН: ");
            inn = sc.nextLine();

            try {
                if (isValidInn(inn)) {
                    System.out.println("ИНН действителен для клиента " + fullName);
                } else {
                    throw new InvalidInnException("Недействительный ИНН");
                }
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
//        } catch (java.text.ParseException e) {
//            System.out.println("Неверный формат даты!");
//            System.exit(1);
//        }
    }

    public static boolean isValidInn(String inn) {
        if (inn.length() != 10) {
            return false;
        }
        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}