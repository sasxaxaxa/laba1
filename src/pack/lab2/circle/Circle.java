package pack.lab2.circle;

public class Circle {
    public Circle(double r) {
        this.r = r;
    }

    private double r;

    private double getR() {
        return r;
    }

    public void setR() {
        this.r = r;
    }

    public double getLenght() {
        double c = 2 * Math.PI * r;
        return c;
    }

    public double getSquare() {
        double s = Math.PI * r * r;
        return s;
    }

    public void circleEqual(double r1, double r2) {
        if (r1 == r2) {
            System.out.println("Окружности равны");
        }
        else {
            if (r1 > r2) {
                System.out.println("Первая окружность больше");
            } else {
                System.out.println("Вторая окружность больше");
            }
        }
    }
}