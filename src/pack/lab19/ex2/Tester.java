package pack.lab19.ex2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {




        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("A a", 5));
        students.add(new Student("B b", 4.5));
        students.add(new Student("C c", 2.7));
        students.add(new Student("D d", 3.4));

        System.out.println("Сортировка студентов по среднему баллу:");
        Collections.sort(students, new StudentComparator());
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите имя студента для поиска: ");
            String searchName = sc.nextLine();
            try {
                Student foundStudent = findStudentByName(students, searchName);
                System.out.println("Найденный студент: " + foundStudent);
            } catch (StudentNotFoundException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static Student findStudentByName(ArrayList<Student> students, String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем '" + name + "' не найден.");
    }
}