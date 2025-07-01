package binarySearch.twoDArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatrixMedian {
    private static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lst.add(matrix[i][j]);
            }
        }

        Collections.sort(lst);

        return lst.get((n * m) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(findMedian(matrix));

        scanner.close();
    }
}
