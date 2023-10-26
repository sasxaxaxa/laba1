package pack.lab2.point;

import java.util.Scanner;


public class Tester {
    private final Circle[] circles;
    private int size;

    public Tester(int size1) {
        circles = new Circle[size1];
        size = 0;
    }

    public void Adder(Circle circle) {
        if (size < circles.length) {
            circles[size] = circle;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tester tester = new Tester(10);


        System.out.println("Would you like to add a circle?\nYes -> 1\nNo -> 0");
        int answer = sc.nextInt();
        while (answer == 1) {
            System.out.println("Enter x, y");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point center2 = new Point(x, y);
            System.out.println("Enter radius");
            double r2 = sc.nextDouble();
            Circle circle2 = new Circle(r2, center2);
            tester.Adder(circle2);
            System.out.println("Would you like to add a circle?\nYes -> 1\nNo -> 0");
            answer = sc.nextInt();
        }


        for (int i = 0; i < tester.getSize(); i++) {
            Circle circle = tester.circles[i];
            System.out.println("Circle " + (i + 1) + ": center: " + circle.getPoint().getX()
                    + ", " + circle.getPoint().getY() + ", radius: " + circle.getR());
        }
        System.out.println("Added circles:" + tester.getSize());
    }
}