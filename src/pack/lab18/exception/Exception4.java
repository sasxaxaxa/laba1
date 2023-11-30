package pack.lab18.exception;

import java.util.Scanner;

public class Exception4 {

    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong type");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("End");
        }
    }

    public static void main(String[] args) {
        Exception4 e4 = new Exception4();
        e4.exceptionDemo();
    }

}
