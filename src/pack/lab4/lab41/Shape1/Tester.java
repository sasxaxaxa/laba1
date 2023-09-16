package pack.lab4.lab41.Shape1;


import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        String answer = " ";
        System.out.println("Начните вводить фигуры. Для окончания вывода нажмите Enter (==введите пустую строку)");

        while (!answer.equals("")) {
            System.out.println("Введите тип фигуры для добавления\n1.Круг\n2.Квадрат\n3.Прямоугольник");
            answer = sc.nextLine().toUpperCase();
            switch (answer) {
                case "1", "КРУГ":
                    System.out.println("Введите радиус");
                    double r = sc.nextDouble();
                    sc.nextLine();
                    Circle circle = new Circle(r);
                    shapes.add(circle);
                    break;
                case "2", "КВАДРАТ":
                    System.out.println("Введите сторону");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    Square square = new Square(a);
                    shapes.add(square);
                    break;
                case "3", "ПРЯМОУГОЛЬНИК":
                    System.out.println("Введите стороны");
                    double c = sc.nextDouble();
                    double d = sc.nextDouble();
                    sc.nextLine();
                    if (c == d) {
                        System.out.println("Вы ввели квадрат");
                        Square square1 = new Square(c);
                        shapes.add(square1);
                    }
                    else {
                        Rectangle rectangle = new Rectangle(c, d);
                        shapes.add(rectangle);
                    }
                    break;
                case "":
                    break;
                default:
                    System.out.println("Такой фигуры нет");
            }
        }


        answer = " ";

        while (!answer.equals("")) {
            System.out.println("\nВыберите метод для фигур.\n1.Показать список фигур\n2.Найти площади фигур\n3.Найти периметры");
            answer = sc.nextLine().toUpperCase();
            switch (answer) {
                case "1", "СПИСОК":
                    System.out.println("Список фигур\n");
                    for (Shape shape: shapes) {
                        System.out.println(shape.toString());

                }
                    break;
                case "2", "ПЛОЩАДЬ", "ПЛОЩАДИ":
                    System.out.println("Площади фигур\n");
                    for (Shape shape: shapes) {
                        System.out.printf("Фигура: %s, площадь: %.2f\n", shape.getType().toLowerCase(), shape.getArea());
                    }
                    break;
                case "3", "ПЕРИМЕТР", "ПЕРИМЕТРЫ":
                    System.out.println("Периметры фигур\n");
                    for (Shape shape: shapes) {
                        System.out.printf("Фигура: %s, периметр: %.2f\n", shape.getType().toLowerCase(), shape.getPerimetr());
                    }
                case "":
                    break;
                default:
                    System.out.println("Такого метода нет");
            }
        }

    }
}