package pack.lab6.priceable4;

public interface Priceable {
    String getPrice();
}

class Computer implements Priceable {
    private Double price;
    private String model;
    public Computer(String model, Double price) {
        this.price = price;
        this.model = model;
    }
    @Override
    public String getPrice() {
        Double.toString(price);
        return model + " " + price + "$";
    }
}

class Smartphone implements Priceable {
    private Double price;
    private String model;

    public Smartphone(String model, Double price) {
        this.price = price;
        this.model = model;
    }
    @Override
    public String getPrice() {
        Double.toString(price);
        return model + " " + price + "$";
    }
}

class TV implements Priceable {
    private String model;
    private Double price;
    public TV(String model, Double price) {
        this.price = price;
        this.model = model;
    }
    @Override
    public String getPrice() {
        Double.toString(price);
        return model + " " + price + "$";
    }
}
