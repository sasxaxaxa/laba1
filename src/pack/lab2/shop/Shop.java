package pack.lab2.shop;

import java.util.Scanner;
import java.util.ArrayList;

public class Shop {

    public void Adder(String device) {
        devices.add(device);
    }
    public void Remover(String device) {

        devices.remove(device);
    }
    public void Searcher(String device) {
        if (devices.contains(device)) {
            System.out.println("Компьютер найден");
        } else {
            System.out.println("Компьютер не найден");
        }
    }

    static ArrayList<String> devices = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("Добавление компьютеров. Для окончания ввода введите 0");
        String device = sc.nextLine();
        while (!device.equals("0")) {
            shop.Adder(device);
            device = sc.nextLine();
        }
        System.out.println("Ассортимент магазина:");
        for (int i = 0; i < devices.size(); ++i) {
            System.out.print(Shop.devices.get(i) + ' ');
        }
        System.out.println("\nЖелаете удалить компьютер? (1)");
        int answer = sc.nextInt();
        sc.nextLine();
        if (answer == 1) {
            System.out.println("Введите название:");
            device = sc.nextLine();
            shop.Remover(device);
        }
        System.out.println("Ассортимент магазина:");
        for (int i = 0; i < devices.size(); ++i) {
            System.out.print(Shop.devices.get(i) + ' ');
        }
        System.out.println("\nВыполнить поиск компьютера? (1)");
        answer = sc.nextInt();
        sc.nextLine();
        if (answer == 1) {
            System.out.println("Введите название:");
            device = sc.nextLine();
            shop.Searcher(device);
        }
    }
}