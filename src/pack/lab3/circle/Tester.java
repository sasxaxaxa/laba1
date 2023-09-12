package pack.lab3.circle;

import java.util.*;
public class Tester {
    public static void main(String[] args) {
        CircleArray circlesarray = new CircleArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество кругов");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Random rand = new Random();
            double x = rand.nextDouble(10);
            double y = rand.nextDouble(10);
            double r2 = rand.nextDouble(10);
//            System.out.printf("x = %.3f, y = %.3f, radius = %.3f\n", x, y, r2);

            Point center2 = new Point(x, y);
            Circle circle2 = new Circle(r2, center2);
            circlesarray.Adder(circle2);
        }

        for (Circle circle : circlesarray.getCircles()) {
            System.out.printf("Круг: центр: %.3f, %.3f; радиус: %.3f\n", circle.getPoint().getX(), circle.getPoint().getY(), circle.getR());
        }
        System.out.println("Выберите метод:\n1.Отсортировать массив (по размеру)\n2.Найти самую большую окружность\n3.Найти самую маленькую окружность");
        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                circlesarray.sortingCircles();
                for (Circle circle : circlesarray.getCircles()) {
                    System.out.printf("Круг: центр: %.3f, %.3f; радиус: %.3f\n", circle.getPoint().getX(), circle.getPoint().getY(), circle.getR());
                }
                break;
            case 2:
                circlesarray.sortingCircles();
                System.out.printf("Самая большая окружность: центр: %.3f, %.3f; радиус: %.3f\n", circlesarray.lastCircle().getPoint().getX(), circlesarray.lastCircle().getPoint().getY(), circlesarray.lastCircle().getR());
                break;
            case 3:
                circlesarray.sortingCircles();
                System.out.printf("Самая маленькая окружность: центр: %.3f, %.3f; радиус: %.3f\n", circlesarray.firstCircle().getPoint().getX(), circlesarray.firstCircle().getPoint().getY(), circlesarray.firstCircle().getR());
                break;
        }
    }
}