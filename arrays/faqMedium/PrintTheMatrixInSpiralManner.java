package arrays.faqMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintTheMatrixInSpiralManner {
    private static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;

            int left = 0;
            int right = m - 1;
            int top = 0;
            int bottom = n - 1;

            List<Integer> spiral = new ArrayList<>();

            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    spiral.add(matrix[top][i]);
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    spiral.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        spiral.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        spiral.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return spiral;
        }
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

        Solution solution = new Solution();
        List<Integer> spiralList = solution.spiralOrder(matrix);
        for (Integer element : spiralList) {
            System.out.print(element + " ");
        }
        System.out.println();

        scanner.close();
    }
}
