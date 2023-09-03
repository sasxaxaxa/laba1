package pack;

import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of exercise (3-8)");
        int num = sc.nextInt();
        switch (num) {
            case 3:
                ex3();
                break;
            case 4:
                ex4();
                break;
            case 5:
                ex5(args);
                break;
            case 6:
                ex6();
                break;

            default:
                System.out.println("you did not write right number");
        }
    }


    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("__EXERCISE 1__");
        int i = 0;
        System.out.println("enter size of array");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        } else {
            System.out.println("you didn't enter an integer");
        }
        int[] array;
        array = new int[i];
        System.out.println("enter elements");
        for (int j = 0; j < i; j++) {
            array[j] = sc.nextInt();
        }
        double sum = 0;
        double everage;
        for (int j = 0; j < i; j++) {
            sum = sum + array[j];
        }
        everage = sum / array.length;
        System.out.println("sum of elements=" + sum);
        System.out.println("everage=" + everage);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = 0;
        int i = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.out.println("you didn't enter an integer");
        }
        int[] array;
        array = new int[size];

        System.out.println("enter elements");
        do {
            array[i] = sc.nextInt();
            i++;
        }
        while (i != size);
        int max = array[0];
        int min = array[0];
        int j = 0;
        while (j != size) {
            if (array[j] > max) {
                max = array[j];
            }
            if (array[j] < min) {
                min = array[j];
            }
            j++;
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
    public static void ex5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of harmonic series");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(i + " element =  1/" + i + " = " + 1./i);
        }
    }


}