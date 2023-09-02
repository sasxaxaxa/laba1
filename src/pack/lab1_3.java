package pack;
import java.util.Scanner;
public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //exercise 1
        System.out.println("__EXERCISE 1__");
        int i = 0;
        System.out.println("enter size of array");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        else {
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
}