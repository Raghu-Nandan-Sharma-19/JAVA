package binarySearch.twoDArrays;

import java.util.Scanner;

public class SearchInA2dMatrix2 {
    private static boolean searchMatrix(int[][] matrix, int target) {
        // Get the dimensions of the matrix
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Start from the top-right corner of the matrix
        int row = 0, column = m - 1;

        // Continue searching while we're still within the matrix boundaries
        while (row < n && column >= 0) {
            if (matrix[row][column] == target) {
                return true; // Target found, return true
            } else if (matrix[row][column] < target) {
                // Current value is smaller than target
                // Since values increase as we go down, move to the next row
                row++;
            } else {
                // Current value is larger than target
                // Since values decrease as we go left, move to the previous column
                column--;
            }
        }

        // If we've exhausted our search space without finding the target
        return false; // Target not found in matrix
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

        int target = scanner.nextInt();

        System.out.println(searchMatrix(matrix, target) ? "True" : "False");

        scanner.close();
    }
}
