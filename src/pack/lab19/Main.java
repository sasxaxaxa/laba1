package pack.lab19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

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

    public static boolean isValidInn(String inn) {
// Проверка действительности ИНН
// Реализация проверки ИНН может быть различная в зависимости от страны

// Пример простой проверки ИНН для России:
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

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}
