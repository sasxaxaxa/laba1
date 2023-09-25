package pack.lab6.shop;


public class Monitor {
    private String name;
    private double size;

    public Monitor(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String toString() {
        return "Model: " + name +
                "\nSize: " + size;
    }
}