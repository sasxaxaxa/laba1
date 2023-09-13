package pack.lab3.lab3example;

import java.util.Random;
public class generateRandom {
    public static void main(String args[]) {
// Создаем экземпляр класса Random
        Random rand = new Random();
// Генерируем рандомно целые числа в диапазоне 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
// Печатаем полученные числа тип - int
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);
// Генерируем с помощью Random тип double
        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();
// Печатаем полученные числа - тип double
        System.out.println("Random Doubles: " + rand_dub1);
        System.out.println("Random Doubles: " + rand_dub2);
    }
}