package pack.lab2.book1;


public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        Book book1 = new Book("Автор 1", "Название 1", 2000);
        Book book2 = new Book("Автор 2", "Название 2", 1990);
        Book book3 = new Book("Автор 3", "Название 3", 2010);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        Book earliestBook = bookshelf.getEarliestBook();
        System.out.println("Самая ранняя книга: " + earliestBook.getTitle());

        Book latestBook = bookshelf.getLatestBook();
        System.out.println("Самая поздняя книга: " + latestBook.getTitle());

        System.out.println("Книги на полке перед сортировкой:");
        for (Book book : bookshelf.getBooks()) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }

        bookshelf.sortBooksByYear();

        System.out.println("Книги на полке после сортировки:");
        for (Book book : bookshelf.getBooks()) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
    }
}