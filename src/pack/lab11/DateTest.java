package pack.lab11;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("toString(): " + now);

        SimpleDateFormat dateFormattter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1: " + dateFormattter.format(now));

        dateFormattter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2: " + dateFormattter.format(now));

        dateFormattter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3: " + dateFormattter.format(now));
    }
}
