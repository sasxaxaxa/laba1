package pack;
import java.util.Scanner;
public class lab1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.out.println("you didn't enter an integer");
        }


    }


}
