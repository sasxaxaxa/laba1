package pack.lab7.Printable78;


public interface Printable {
    void print();
}

class Book implements Printable {
    private String name;
    private String author;
    private Integer year;

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга %s, автор: %s, год издания: %d\n", name, author, year);
    }
}

class Magazine implements Printable {
    private String name;
    private String company;
    private Integer price;

    public Magazine(String name, String company, Integer price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("Журнал %s, издание: %s, цена: %d$\n", name, company, price);

    }
}

