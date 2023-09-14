package pack.lab3.format;

import java.util.Locale;
import java.util.Scanner;

public class Convertor {
    public class Course {

        // Продажа человеком банку
        public static class Sale {
            double usd = 91.50;
            double eur = 99.30;

            public double getEur() {
                return eur;
            }

            public double getUsd() {
                return usd;
            }
        }

        public static class Purchase {
            double usd = 94.65;
            double eur = 102.10;

            public double getEur() {
                return eur;
            }

            public double getUsd() {
                return usd;
            }
        }
    }

    public static void main(String[] args) {
        String ans = "";
        while ("12".contains(ans)) {
            double rub;
            String currency;
            System.out.println("Купить USD, EUR -> 1\nПродать USD, EUR-> 2\nДля выхода введите любой символ");
            Scanner sc = new Scanner(System.in);
            ans = sc.nextLine();
            switch (ans) {
                case "1":
                    Double c;
                    int avilable;
                    Course.Purchase purchase = new Course.Purchase();
                    System.out.printf("Текущий курс для покупки: USD: %.2f, EUR: %.2f\nВведите количество рублей: ", purchase.getUsd(), purchase.getEur());
                    rub = sc.nextDouble();
                    while (rub <= 0) {
                        System.out.println("Вы ввели неверное количество рублей. Введите количество рублей: ");
                        rub = sc.nextDouble();
                    }
                    sc.nextLine();
                    System.out.println("Выберите валюту для покупки(USD/EUR)");
                    currency = sc.nextLine().toLowerCase(Locale.ROOT);
                    while (!currency.equals("usd") && !currency.equals("eur")) {
                        System.out.println("Вы ввели неподходящую валюту");
                        currency = sc.nextLine().toLowerCase(Locale.ROOT);
                    }
                    switch (currency) {
                        case "usd":
                            c = (rub / purchase.getUsd());
                            avilable = c.intValue();
                            System.out.printf("Вы можете купить %d USD\n\n", avilable);
                            break;
                        case "eur":
                            c = (rub / purchase.getEur());
                            avilable = c.intValue();
                            System.out.printf("Вы можете купить %d EUR\n\n", avilable);
                            break;
                    }
                    break;
                case "2":
                    double valuee;
                    Course.Sale sale = new Course.Sale();
                    System.out.printf("Текущий курс для продажи: USD: %.2f, EUR: %.2f\nВыберите валюту для продажи(USD/EUR)\n", sale.getUsd(), sale.getEur());
                    currency = sc.nextLine().toLowerCase(Locale.ROOT);
                    while (!currency.equals("usd") && !currency.equals("eur")) {
                        System.out.println("Вы ввели неподходящую валюту");
                        currency = sc.nextLine().toLowerCase(Locale.ROOT);
                    }
                    switch (currency) {
                        case "usd":
                            System.out.println("Введите количество долларов");
                            valuee = sc.nextDouble();
                            c = (sale.getUsd() * valuee);
                            System.out.printf("Вы можете получить %.3f рублей\n\n", c);
                            break;
                        case "eur":
                            System.out.println("Введите количество евро");
                            valuee = sc.nextDouble();
                            c = (sale.getEur() * valuee);
                            System.out.printf("Вы можете получить %.2f рублей\n\n", c);
                            break;
                    }
                    break;
            }
        }
    }
}