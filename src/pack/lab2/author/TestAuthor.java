package pack.lab2.author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author a1 = new Author("sasha", "sasxa", 'f');
        System.out.println(a1);

        System.out.println("enter name");
        String name1 = sc.nextLine();
        System.out.println("enter email");
        String email1 = sc.nextLine();
        System.out.println("enter gender");
        char gender1 = sc.next().charAt(0);
        a1.setName(name1);
        a1.setEmail(email1);
        a1.setGender(gender1);
        System.out.println(a1);
    }


}
