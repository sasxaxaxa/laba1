package pack.lab2.book;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Введите автора:");
            sc.nextLine();
            String author = sc.nextLine();
            System.out.println("Введите название:");
            String title = sc.nextLine();
            System.out.println("Введите год издания");
            int year = sc.nextInt();
            Book book = new Book(author, title, year);
            shelf.Adder(book);
        }

        System.out.println("Что нужно сделать с книгами?\n1.Отсортировать по названию\n" + "2.Отсортировать по году издания\n" +
                "3.Книга с самым поздним сроком издания\n4.Книга с самым ранним сроком издания\n");

        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                shelf.sortByTitle();
                for (Book book : shelf.getBooks()) {
                    System.out.println("Книга " + book.getTitle() + ", автор: " + book.getAuthor() + ", год издания: " + book.getYear());
                }
                break;
            case 2:
                shelf.sortByYear();
                for (Book book : shelf.getBooks()) {
                    System.out.println("Книга " + book.getTitle() + ", автор: " + book.getAuthor() + ", год издания: " + book.getYear());
                }
                break;
            case 3:
                shelf.sortByYear();
                System.out.println("Самая молодая книга: " + shelf.lastBook().getTitle());
                System.out.println("Год издания: " + shelf.lastBook().getYear());
                break;
            case 4:
                shelf.sortByYear();
                System.out.println("Самая старая книга: " + shelf.firstBook().getTitle());
                System.out.println("Год издания: " + shelf.firstBook().getYear());
                break;
        }

    }

}
