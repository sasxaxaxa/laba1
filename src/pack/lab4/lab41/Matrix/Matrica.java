package pack.lab4.lab41.Matrix;

public class Matrica {
    public int n;
    public int m;
    private Integer[][] matrix;

    public Matrica(Integer[][] matrix) {
        this.matrix = matrix;
    }
    public Integer[][] getMatrix() {
        return matrix;
    }
    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }

    public void Show(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void Sum(Integer[][] matrica2, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Integer el = matrix[i][j] + matrica2[i][j];
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
    public void Scalar(int b, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Integer el = matrix[i][j]*b;
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
    public void Proizv(Integer[][] matrica2, int n, int m) {
        Integer[][] array = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    array[i][j] = array[i][j] + matrix[i][k] * matrica2[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }


}
