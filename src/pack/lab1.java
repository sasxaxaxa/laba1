package pack;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = 2;
//        System.out.println("Enter int num");
//        if (sc.hasNextInt()) {
//            i = sc.nextInt();
//            System.out.println(i*2);
//        }
//        else {
//            System.out.println("No int num");
//        }
//    }
        String s1 = "firefox";
        System.out.println(s1.toUpperCase());
        String s2 = s1.replace('o', 'a');
        System.out.println(s2); // выведет «firefax»
        System.out.println(s2.charAt(1)); // выведет «i»
        int i;
        i = s1.length();
        System.out.println(i);
        i = s1.indexOf('f');
        System.out.println(i);
        i= s1.indexOf('r');
        System.out.println(i);
        i =s1.lastIndexOf('f');
        System.out.println(i);
        i = s1.indexOf('t');
        System.out.println(i);
        i = s1.indexOf('r',3);
        System.out.println(i);
    }
}