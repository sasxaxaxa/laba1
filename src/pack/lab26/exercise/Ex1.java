package pack.lab26.exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                i = sc.nextInt();
                al.add(i);
            }
        }
        System.out.println("Исходный массив: " + al);
        revers(al);
        System.out.println("Перевернутый массив: " + al);
        System.out.println(al);

    }

    public static void revers(ArrayList<Integer> array) {
        Stack<Integer> stack = new Stack<>();

        for (Integer i : array) {
            stack.push(i); //пуш добавляет элемент в начало стека

        }
        for (int i = 0; i < array.size(); i++) {
            array.set(i, stack.pop()); //значение элемента с индексом i заменяется на значение stack.pop().
        }
    }
}

//}
//
//// at beginning itr(cursor) will point to
//// index just before the first element in al
//        Iterator itr = al.iterator();
//
//// checking the next element availabilty
//        while (itr.hasNext()) {
//// moving cursor to next element
//            int i = (Integer) itr.next();
//
//// getting even elements one by one
//            System.out.print(i + " ");
//
//// Removing odd elements
//            if (i % 2 != 0)
//                itr.remove();
//        }
//        System.out.println();
//        System.out.println(al);
//    }

