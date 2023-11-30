package pack.lab23.exercises.ex1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("ArrayQueueModule");

        ArrayQueueModule.init(10);

        System.out.println("Добавление элементов в очередь. Введите элементы: ");
        try (Scanner sc = new Scanner(System.in)) {
            String elem = "";
            while (!elem.equals("-")) {
                if (sc.hasNextInt()) {
                    elem = sc.nextLine();
                    Integer elem1 = Integer.parseInt(elem);
                    ArrayQueueModule.enqueue(elem1);
                } else {
                    break;
                }
            }
        }

        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удалить и вернуть первый элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удалить и вернуть первый элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println();

        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.init(5);
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        queueADT.enqueue(3);
        queueADT.enqueue(4);
        System.out.println("Первый элемент: " + queueADT.element());
        System.out.println("Удалить и вернуть первый элемент: " + queueADT.dequeue());
        System.out.println("Размер очереди: " + queueADT.size());

        System.out.println("Первый элемент: " + queueADT.element());
        System.out.println("Удалить и вернуть первый элемент: " + queueADT.dequeue());
        System.out.println("Размер очереди: " + queueADT.size());
        queueADT.clear();




        System.out.println();
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.clear();

        System.out.println();



    }
}
//
//        // Пример использования ArrayQueue
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        System.out.println("Front element: " + queue.element());
//        System.out.println("Dequeued element: " + queue.dequeue());
//        System.out.println("Queue size: " + queue.size());
//        queue.clear();
//    }

/*
public class Main {
    public static void main(String[] args) {
        // Пример использования ArrayQueueModule
        ArrayQueueModule.init(5);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Front element: " + ArrayQueueModule.element());
        System.out.println("Dequeued element: " + ArrayQueueModule.dequeue());
        System.out.println("Queue size: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();

        // Пример использования ArrayQueueADT
        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.init(5);
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        System.out.println("Front element: " + queueADT.element());
        System.out.println("Dequeued element: " + queueADT.dequeue());
        System.out.println("Queue size: " + queueADT.size());
        queueADT.clear();

        // Пример использования ArrayQueue
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Front element: " + queue.element());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
        queue.clear();
    }
}*/