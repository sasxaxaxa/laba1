package pack.lab2.ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ball b1 = new Ball(0.0, 0.0);
        System.out.println(b1);
        System.out.println("Установите координаты шара:");
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();
        b1.setX(x);
        b1.setY(y);
        System.out.println("Координаты шара: x = " + b1.getX() +
                ", y = " + b1.getY());
        System.out.println("Установите перемещение шара");
        System.out.print("x = ");
        double xDisp = sc.nextDouble();
        System.out.print("y = ");
        double yDisp = sc.nextDouble();
        b1.move(xDisp, yDisp);

        System.out.println("Шар перемещен на x:" +
                b1.movementX(x, xDisp) + ", y:" +
                b1.movementY(y, yDisp));
    }
}
