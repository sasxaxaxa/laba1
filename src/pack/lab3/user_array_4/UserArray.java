package pack.lab3.user_array_4;

import java.util.Scanner;


public class UserArray {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int n;
        if (!sc.hasNextInt()) {
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не подходящее число");
                sc.nextLine();
            }
        }
        n = sc.nextInt();
        int c = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * n);
            array[i] = x;
            if (x % 2 == 0) {
                c++;
            }
        }
        int j = 0;
        int[] array_new = new int[c];
        System.out.println("Полученный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                array_new[j] = array[i];
                j++;
            }
        }
        System.out.println("\nЧетные элементы массива:");
        for (int i = 0; i < c; i++) {
            System.out.print(array_new[i] + " ");
        }
    }
}
