package pack;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of exercise (3-8)");
        int num = sc.nextInt();
        //proverka
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
            case 7:
                ex7();
                break;
            default:
                System.out.println("you did not write right number");
        }
    }


    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("__EXERCISE 2__\n" +
                "Написать программу, в результате которой массив чисел создается с\n" +
                "помощью инициализации (как в Си) вводится и считается в цикле сумма\n" +
                "элементов целочисленного массива, а также среднее арифметическое его\n" +
                "элементов результат выводится на экран.\n");
        int i = 0;
        System.out.println("enter size of array ->");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        } else {
            System.out.println("you didn't enter an integer");
        }
        int[] array;
        array = new int[i];
        System.out.println("enter elements ->");
        for (int j = 0; j < i; j++) {
            array[j] = sc.nextInt();
        }
        double sum = 0;
        double everage;
        for (int j = 0; j < i; j++) {
            sum = sum + array[j];
        }
        everage = sum / array.length;
        System.out.println("sum of elements = " + sum);
        System.out.println("everage = " + everage);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("__EXERCISE 4__\n" +
                "Написать программу, в результате которой массив чисел вводится\n" +
                "пользователем с клавиатуры считается сумма элементов целочисленного\n" +
                "массива с помощью циклов do while, while, также необходимо найти\n" +
                "максимальный и минимальный элемент в массиве, результат выводится на экран.\n");
        System.out.println("enter size of array ->");
        int size = 0;
        int i = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.out.println("you didn't enter an integer");
        }
        int[] array;
        array = new int[size];

        System.out.println("enter elements ->");
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
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static void ex5(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void ex6() {
        System.out.println("__EXERCISE 6__\n" +
                "Написать программу, в результате работы которой выводятся на экран\n" +
                "первые 10 чисел гармонического ряда (форматировать вывод)\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of harmonic series ->");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(i + " element =  1/" + i + " = " + 1./i);
        }
    }
    public static void ex7() {
        System.out.println("__EXERCISE 7__\n" +
                "Написать программу, которая с помощью метода класса, вычисляет\n" +
                "факториал числа (использовать управляющую конструкцию цикла), проверить\n" +
                "работу метода\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number (>0) ->");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial of number " + num + " = " + fact);
    }


}