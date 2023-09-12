package pack.lab3;
import java.util.Formatter;
public class obolochki_1_1 {

    public static void main(String args[]) {
        String s = ", ";

        int ix = 99;
        double dx = 9.99;
        float fx = 9999;
        String sx = "99999";


        Double d1 = Double.valueOf(ix);
        Double d2 = Double.valueOf(dx);
        Double d3 = Double.valueOf(fx);
        Double d4 = Double.parseDouble(sx);

        System.out.println("Первое приведение типов:");
        System.out.println("int: " + ix + ", double: " + dx + ", float: " + fx + ", string: " + sx);
        System.out.println("Double: " + d1 + s + d2 + s + d3+ s + d4);


        Double e = Math.random()*10;
        int ei = e.intValue();
        String es = e.toString();
        float ef = e.floatValue();

        System.out.println("\nВторое приведение типов:");
        System.out.println("Double: " + e);
        System.out.println("int: " + ei + ", float: " + ef + ", string: " + es);


        String d = Double.toString(3.14);

        System.out.println("\n" + d);
    }

}