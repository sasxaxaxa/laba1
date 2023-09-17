package pack.lab6.Printable6789;

import pack.lab6.Priceable.Priceable;

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
class Shop implements Printable {
    private String name;
    private String type;
    private String shedule;

    public Shop(String name, String type, String shedule) {
        this.name = name;
        this.type = type;
        this.shedule = shedule;
    }

    @Override
    public void print() {
        System.out.printf("Это магазин с названием %s, продает %s, открыт: %s\n", name, type, shedule);
    }
}