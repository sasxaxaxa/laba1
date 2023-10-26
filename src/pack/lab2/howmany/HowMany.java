package pack.lab2.howmany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = 0;
        if (a.length() != 0) {
            c++;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    c++;
                }
            }
        }
        System.out.println(c + " слов(a)");
    }
}
