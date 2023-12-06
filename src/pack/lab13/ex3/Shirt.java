package pack.lab13.ex3;

class Shirt {
    private final String number;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String number, String description, String color, String size) {
        this.number = number;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Number: " + number + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size + "\n";
    }
}