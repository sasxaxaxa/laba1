package pack.lab2.point;

public class Point {
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}