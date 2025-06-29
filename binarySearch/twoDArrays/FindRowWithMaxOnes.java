package binarySearch.twoDArrays;

import java.util.Scanner;

public class FindRowWithMaxOnes {
    private static int rowWithMax1s(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int maxOnes = 0;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            int countOnes = 0;

            for (int j = 0; j < m; j++) {
                countOnes += mat[i][j];    
            }

            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(rowWithMax1s(mat));

        scanner.close();
    }
}
