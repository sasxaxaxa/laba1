package pack.lab6.Convertable;

public class Tester {
    public static void main(String[] args) {
        for (int i = -100; i < 100; i = i + 10) {
            Double d = Double.valueOf(i);
            toCels cels = new toCels(d);
            cels.convert();
        }
    }
}
