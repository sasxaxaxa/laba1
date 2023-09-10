package pack.lab2.shop;

import java.util.Scanner;

public class TesterShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        System.out.println("Введите компьютеры");
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Добавить 1, удалить 2");
        int x = sc.nextInt();

    }
}
