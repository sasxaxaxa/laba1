package pack.lab8;

public class Ex2 {
    public static void recursion(int j) {

        for (int i = 1; i <= j; i++) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) throws Exception {
        new Input(System.in).processInt(number -> {
            recursion(number);
        }).close();
    }


}
