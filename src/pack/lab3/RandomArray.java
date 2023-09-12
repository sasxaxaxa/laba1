package pack.lab3;

import java.lang.reflect.Array;
import java.util.*;

public class RandomArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите метод генерации массива\n1.Random\n2.Math");
        int n = sc.nextInt();


        switch (n) {
            case 1:
                RandomRand();
                break;
            case 2:
                RandomMath();
                break;


        }
    }

    public static void RandomRand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        ArrayList<Double> ArrayRand = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            double rand1 = rand.nextDouble(10);
            ArrayRand.add(rand1);
        }
        System.out.println("Полученный массив");
        for (Double rand : ArrayRand) {
            System.out.println(rand);
        }
        Collections.sort(ArrayRand);
        System.out.println("Отсортированный массив");
        for (Double rand : ArrayRand) {
            System.out.println(rand);
        }

    }

    public static void RandomMath() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size1 = sc.nextInt();
        ArrayList<Double> ArrayMath = new ArrayList<>(10);
        for (int i = 0; i < size1; i++) {
            double rand1 = Math.random() * 10;
            ArrayMath.add(rand1);
        }
        System.out.println("Полученный массив");
        for (Double rand : ArrayMath) {
            System.out.println(rand);
        }
        Arrays.sort(new ArrayList[]{ArrayMath});
        System.out.println();
        for (Double rand : ArrayMath) {
            System.out.println(rand);
        }
        Collections.sort(ArrayMath);
        System.out.println("Отсортированный массив");
        for (Double rand : ArrayMath) {
            System.out.println(rand);
        }
    }
}

//    ObjectName[] arr = new ObjectName[10];
//Arrays.sort(arr, new Comparator<ObjectName>() {
//        public int compare(ObjectName o1, ObjectName o2) {
//            return o1.toString().compareTo(o2.toString());
//        }
//    });

//        public void sortByTitle() {
//            Collections.sort(books, Comparator.comparing(Book::getTitle));
//        }





