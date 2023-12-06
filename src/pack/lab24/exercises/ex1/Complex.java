package pack.lab24.exercises.ex1;

public class Complex {
    private final int real;
    private final int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Complex Number: " + real + "+" + image + "i";
    }
}