package arrays.faqMedium;

import java.util.Scanner;

public class RotateMatrixBy90Degrees {
    private static class Solution {
        // function to print matrix
        private void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }

        // function to swap two elements in matrix
        private void swap(int[][] matrix, int i, int j) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }

        // function to reverse row of matrix
        private void reverseRow(int[][] matrix, int n) {
            // iterating from 0 to n - 1
            for (int i = 0; i < n; i++) {
                // iterating from j = 0 to j < (n / 2)
                for (int j = 0; j < (n / 2); j++) {
                    /* swapping the element at i with element at the end
                     * of the row in order to reverse the row
                     */
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
        }

        // function to rotate matrix by 90 degrees
        public void rotateMatrix(int[][] matrix) {
            int n = matrix.length;

            // transposing the matrix
            for (int i = 0; i < (n - 1); i++) {
                for (int j = i + 1; j < n; j++) {
                    swap(matrix, i, j);
                }
            }

            // reversing the rows of matrix
            reverseRow(matrix, n);
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
        solution.printMatrix(matrix);

        scanner.close();
    }
}
