package pack.lab2.ball;

public class Ball {
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;


    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = xDisp;
        this.y = yDisp;
    }

    public double movementX(double x, double xDisp) {
        double xend = Math.abs(x - xDisp);
        return (xend);
    }

    public double movementY(double y, double yDisp) {
        double yend = Math.abs(y - yDisp);
        return (yend);
    }

    public String toString() {
        return "Ball{x = " + x + ", y = " + y + "}";
    }

}
