package pack.lab41.Matrix;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = sc.nextInt();
        System.out.println("Введите количество столбцов");
        int m = sc.nextInt();
        Integer[][] matrix1 = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Введите элемент %d %d ->", i+1, j+1);
                int el = sc.nextInt();
                matrix1[i][j] = el;
            }
        }
        Matrica matrica = new Matrica(matrix1);

        System.out.println("Что нужно сделать с матрицей?");
        String answer = sc.nextLine();


        Integer[][] matrix2 = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Введите элемент %d %d ->", i+1, j+1);
                int el = sc.nextInt();
                matrix2[i][j] = el;
            }
        }
        matrica.Sum(matrix2, n, m);


    }
}