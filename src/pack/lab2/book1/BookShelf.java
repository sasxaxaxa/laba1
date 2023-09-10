package pack.lab2.book1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bookshelf {
    private ArrayList<Book> books;
    public Bookshelf() {
        this.books = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getEarliestBook() {
        return Collections.min(books, Comparator.comparing(Book::getYear));
    }

    public Book getLatestBook() {
        return Collections.max(books, Comparator.comparing(Book::getYear));
    }

    public void sortBooksByYear() {
        Collections.sort(books, Comparator.comparing(Book::getYear));
    }
}
