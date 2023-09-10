package pack.lab2.book;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
public class BookShelf {
    private static ArrayList<Book> books;
    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void Adder(Book book) {
        books.add(book);
    }
    public void Remover(Book book) {
        books.remove(book);
    }

    public Book firstBook() {
        return Collections.min(books, Comparator.comparing(Book::getYear));
    }
    public Book lastBook() {
        return Collections.max(books, Comparator.comparing(Book::getYear));
    }

    public void sortByYear() {
        Collections.sort(books, Comparator.comparing(Book::getYear));
    }
    public void sortByAuthor() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
    }
    public void sortByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

}
