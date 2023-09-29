package pack.lab8;

public class Ex1 {
    public static int recursion(int n, int check) {
        for (int i = 0; i < check; i++) {
            System.out.print(check + " ");
        }
        if (check != n) {
            check += 1;
            return recursion(n, check);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        new Input(System.in).processInt(number -> {
            int check = 1;
            recursion(number, check);
        }).close();
    }
}
