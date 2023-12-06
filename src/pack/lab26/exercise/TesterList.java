package pack.lab26.exercise;

import java.util.Scanner;

public class TesterList {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Введите размер массива: ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            Integer[] array = new Integer[size];

            while (i != array.length && sc.hasNextInt()) {
                array[i] = sc.nextInt();
                i++;
            }
            FirstList firstList = new FirstList(array);
            System.out.println("Массив: " + firstList);

            System.out.println("Массив не пуст? " + firstList.iterator().hasNext());

            System.out.println("Последний элемент: " + firstList.iterator().next());

            firstList.iterator().remove();

            System.out.println("Удаление первого элемента: " + firstList);
        }

    }
}
