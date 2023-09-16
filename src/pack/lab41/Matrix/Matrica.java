package pack.lab41.Matrix;

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

    public void Sum(Integer[][] matrica2, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Integer el = matrix[i][j] + matrica2[i][j];
                System.out.print(el + " ");
            }
            System.out.println();
        }

    }


}
