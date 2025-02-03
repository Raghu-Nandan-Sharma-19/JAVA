package arrays.faqMedium;

import java.util.Scanner;

public class RotateMatrixBy90Degrees {
    private static class Solution {
        private void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
        
        private void swap(int[][] matrix, int i, int j, int k, int l) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[k][l];
            matrix[k][l] = temp;
        }
    
        public void rotateMatrix(int[][] matrix) {
            // length of the square matrix
            int n = matrix.length;
    
            // iterating through the matrix
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    // swapping the row with column
                    swap(matrix, i, j, j, i);
                }
            }
    
            // iterating through transposed matrix
            for (int i = 0; i < n; i++) {
                // reversing the row
                for (int j = 0; j < n / 2; j++) {
                    swap(matrix, i, j, i, n - 1 - j);
                }
            }

            printMatrix(matrix);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        solution.rotateMatrix(matrix);

        scanner.close();
    }
}
