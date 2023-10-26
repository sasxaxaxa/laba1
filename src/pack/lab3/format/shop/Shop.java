package pack.lab3.format.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static class Convertor {
        double usd = 91.50;
        double eur = 99.30;

        public double getEur() {
            return eur;
        }

        public double getUsd() {
            return usd;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> array = new ArrayList<>(3);
        String[] strings = {"Asus", "Honor", "MSI", "Lenovo", "HP", "Sony", "Huawei", "Apple", "Dell", "Acer"};
        int[] prices = {123456, 987654, 99999, 800, 10220, 965, 2323, 60903, 87654, 777};

        for (int i = 0; i < strings.length; i++) {
//            System.out.println("enter name");
//            String name = sc.nextLine();
//
//            System.out.println("enter price");
//            int price = sc.nextInt();
//            sc.nextLine();
            String name = strings[i];
            int price = prices[i];
            Product product = new Product(name, price);
            array.add(product);
        }

        for (Product product : array) {
            System.out.printf("%d товар: %s, цена: %d\n", array.indexOf(product) + 1, product.getName(), product.getPrice());
        }

        System.out.println("Выберите товар");
        int choose = sc.nextInt() - 1;
        sc.nextLine();
        System.out.println("Выберите валюту для перевода(usd/eur)");
        String ans = sc.nextLine().toLowerCase();


        Convertor conv = new Convertor();
        Product product = array.get(choose);

        switch (ans) {
            case "usd":
                double usd = conv.getUsd();
                System.out.printf("Товар %s под номером %d, стоимость в USD: %d, стоимость в RUB: %.2f", product.getName(), choose + 1, product.getPrice(), conv.getUsd() * product.getPrice());
                break;
            case "eur":
                double eur = conv.getEur();
                System.out.printf("Товар %s под номером %d, стоимость в EUR: %d, стоимость в RUB: %.2f", product.getName(), choose + 1, product.getPrice(), conv.getUsd() * product.getPrice());
                break;
        }
    }
}
