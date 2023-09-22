package pack.lab4.lab41.matrix4;

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
                System.out.printf("Введите элемент %d %d ->", i + 1, j + 1);
                int el = sc.nextInt();
                matrix1[i][j] = el;
            }
        }

        Matrica matrica = new Matrica(matrix1);


        String answer = " ";
        while (!answer.equals("")) {
            System.out.println("Что нужно сделать с матрицей?\n1.Показать матрицу\n2.Сложить с другой матрицей\n3.Умножить на скаляр\n4.Умножить на другую матрицу");
            sc.nextLine();
            answer = sc.nextLine();

            switch (answer) {
                case "1":
                    matrica.Show(n, m);
                    break;
                case "2":
                    System.out.println("Введите вторую матрицу");
                    Integer[][] matrix2 = new Integer[n][m];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("Введите элемент %d %d ->", i + 1, j + 1);
                            int el = sc.nextInt();
                            matrix2[i][j] = el;
                        }
                    }
                    matrica.Sum(matrix2, n, m);
                    break;
                case "3":
                    System.out.println("Введите скаляр");
                    int b = sc.nextInt();
                    matrica.Scalar(b, n, m);
                    break;
                case "4":
                    System.out.println("Введите вторую матрицу");
                    Integer[][] matrix3 = new Integer[n][m];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("Введите элемент %d %d ->", i + 1, j + 1);
                            int el = sc.nextInt();
                            matrix3[i][j] = el;
                        }
                    }
                    matrica.Proizv(matrix3, n, m);
                    break;
                case "":
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }
}