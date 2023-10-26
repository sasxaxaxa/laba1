package pack.lab2.point;

public class Circle {
    public Circle(double r, Point point) {
        this.r = r;
        this.point = point;
    }

    private final Point point;
    private final double r;

    public Point getPoint() {
        return point;
    }

    public double getR() {
        return r;
    }
}