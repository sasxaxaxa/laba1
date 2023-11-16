package pack.lab19.ex2;

import java.util.Comparator;


public class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student && o2 instanceof Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return (int) (((Student) o1).getAverageScore() - ((Student) o2).getAverageScore());
    }
}