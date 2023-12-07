package pack.lab29;

import java.util.Scanner;

public class Graph {
    private static final int INF = 1000 * 1000 * 1000;

    public static void main(String[] args) {
        Graph graph = new Graph();
        int c = solve1();
        System.out.println(c);

    }

    public static int solve1() {

        int vertexCount = 0;
        int[][] g;
        try (Scanner scanner = new Scanner(System.in)) {
            vertexCount = scanner.nextInt();
            g = new int[vertexCount][vertexCount];
            for (int i = 0; i < vertexCount; i++) {
                for (int j = 0; j < vertexCount; j++) {
                    g[i][j] = scanner.nextInt();
                }
            }
        }

        int c = 0;

        //суммируем все пути даже повторяющиеся
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (g[i][j] != 0) {
                    c += 1;
                }
            }
        }
        //вычитаем повторяющиеся, если граф ориентированный
        for (int i = 0; i < vertexCount; i++) {
            for (int j = i; j < vertexCount; j++) {
                if (g[i][j] == 1 & g[j][i] == 1) {
                    c -= 1;
                }
            }
        }
        return c;
    }
}
