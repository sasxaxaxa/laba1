package pack.trash;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2023);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,25);
        System.out.println("Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println("New date: " + sdf.format(cal.getTime()));
    }
}
