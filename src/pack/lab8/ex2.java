package pack.lab8;

import java.util.Scanner;

public class ex2 {
    public static void recursion(int j) {

        for (int i = 1; i <= j; i++) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        recursion(j);

    }



}
