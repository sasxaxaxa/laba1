package pack.lab3.circle_2;

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