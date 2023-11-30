package pack.lab19.ex2;

import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (!(o1 instanceof Student && o2 instanceof Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return (int) (o1.getAverageScore() - o2.getAverageScore());
    }
}