package pack.lab2.circle;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Выберите метод:\n1.Найти площадь\n2.Найти длину окружности\n3.Сравнить с другой окружностью");
        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Площадь круга с радиусом " + r + " равен: " + circle.getSquare());
                break;
            case 2:
                System.out.println("Длина окружности с радиусом " + r + " равна: " + circle.getLenght());
                break;
            case 3:
                System.out.println("Введите радиус второй окружности");
                double r1 = sc.nextDouble();
                circle.circleEqual(r, r1);
                break;
        }



    }

}
