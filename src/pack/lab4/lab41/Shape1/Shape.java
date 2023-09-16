package pack.lab4.lab41.Shape1;

abstract class Shape {
    private String type;
    private double area;
    private double perimetr;
    public Shape(String type) {
        this.type = type;

    }
    public String getType() {
        return type;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetr() {
        return perimetr;
    }
}

class Circle extends Shape {
    public Circle(double r) {
        super("Круг");
        this.r = r;
    }
    final private double r;
    public double getR() {
        return r;
    }

    @Override
    public double getArea() {
        return (r*r*Math.PI);
    }
    public double getPerimetr() {
        return 2*Math.PI*r;
    }
    @Override
    public String toString() {
        return "Круг: " +
                "радиус = " + r;
    }

}
class Square extends Shape {
    public Square(double a) {
        super("Квадрат");
        this.a = a;
    }
    final private double a;
    public double getA() {
        return a;
    }

    @Override
    public double getArea() {
        return (a*a);
    }

    public double getPerimetr() {
        return a*4;
    }
    @Override
    public String toString() {
        return "Квадрат: " +
                "a = " + a;
    }
}
class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super("Прямоугольник");
        this.a = a;
        this.b = b;
    }
    final private double a;
    final private double b;
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getArea() {
        return (a*b);
    }
    public double getPerimetr() {
        return (a+b) * 2;
    }
    @Override
    public String toString() {
        return "Прямоугольник: " +
                "a = " + a +
                ", b = " + b;
    }
}