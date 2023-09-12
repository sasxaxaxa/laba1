package pack.lab3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class RandomArray {
    public static void main(String[] args) {

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



        System.out.println("Введите размер массива");
        int size1 = sc.nextInt();
        ArrayList<Double> ArrayMath = new ArrayList<>(10);
        for (int i = 0; i < size1; i++) {
            double rand1 = Math.random()*10;
            ArrayMath.add(rand1);
        }
        System.out.println("Полученный массив");
        for (Double rand : ArrayMath) {
            System.out.println(rand);
        }
    }
}
