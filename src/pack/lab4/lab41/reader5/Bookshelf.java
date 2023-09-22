package pack.lab4.lab41.reader5;


public class Bookshelf {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 12345, "ИВТ", "01.02.2004", "+777");
        Book book1 = new Book("Горе от ума", "А. С. Грибоедов");
        Book book2 = new Book("Алгоритмы", "И.В. Аникин");
        Book book3 = new Book("Мизери", "Стивен Кинг");

        reader1.takeBook(3);
        reader1.takeBook("Горе от ума", "Алгоритмы", "Мизери");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(1);
        reader1.returnBook("Мизери");
        reader1.returnBook(book3);
    }
}