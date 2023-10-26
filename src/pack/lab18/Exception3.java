package pack.lab18;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Not correct number");
        } catch (Exception e) {
            System.out.println("Exception happened!");
        }
    }

    public static void main(String[] args) {
        Exception2 e2 = new Exception2();
        e2.exceptionDemo();
    }
}