package pack.lab18.exception;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {


        int i;
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("wrong type of entered data");
        }


    }
}