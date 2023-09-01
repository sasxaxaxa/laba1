package pack;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        for (int j = 0; j < i; j++) {
            array[j] = sc.nextInt();
        }
        int sum = 0;
        double everage;
        for (int j = 0; j < i; j++) {
            sum = sum + array[j];
        }
        everage = sum / i;
        System.out.println("sum of elements=" + sum);
        System.out.println("everage=" + everage);
    }
}