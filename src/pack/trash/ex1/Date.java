package pack.trash.ex1;

import java.util.ArrayList;
import java.util.Calendar;


class Programmer {
    private final String name;
    private final Calendar calendar1;
    private final Calendar calendar2;

    public Programmer(String name, Calendar calendar1, Calendar calendar2) {
        this.name = name;
        this.calendar1 = calendar1;
        this.calendar2 = calendar2;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", calendar1=" + calendar1.getTime() +
                ", calendar2=" + calendar2.getTime() +
                '}';
    }
}

class Date {
    public static void main(String[] args) {
        ArrayList<Programmer> array = new ArrayList<>();
        Calendar calendar1 = Calendar.getInstance();

        calendar1.set(Calendar.YEAR, 2023);
        calendar1.set(Calendar.MONTH, 8);
        calendar1.set(Calendar.DAY_OF_MONTH, 1);

        Calendar calendar2 = Calendar.getInstance();

        calendar2.set(Calendar.YEAR, 2023);
        calendar2.set(Calendar.MONTH, 8);
        calendar2.set(Calendar.DAY_OF_MONTH, 30);


        Programmer programmer1 = new Programmer("aaa", calendar1, calendar2);
        Programmer programmer2 = new Programmer("bbb", calendar1, calendar2);

        array.add(programmer1);
        array.add(programmer2);

        for (Programmer programmer : array) {
            System.out.println(programmer.toString());
        }

    }
}
//    Calendar cal = Calendar.getInstance();
//    int year = cal.get(Calendar.YEAR);
//    int month = cal.get(Calendar.MONTH);
//    int day = cal.get(Calendar.DAY_OF_MONTH);
//    int hour = cal.get(Calendar.HOUR_OF_DAY);
//    int minute = cal.get(Calendar.MINUTE);
//    int second = cal.get(Calendar.SECOND);