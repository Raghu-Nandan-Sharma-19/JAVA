package binarySearch.twoDArrays;

import java.util.Scanner;

public class SearchInA2dMatrix {
    private static boolean searchMatrix(int[][] mat, int target) {
        // Get dimensions of the matrix
        int n = mat.length;
        int m = mat[0].length;
        // Initialize pointers for binary search
        // We'll treat the 2D matrix as a flattened 1D array
        int low = 0;
        int high = (n * m) - 1;

        while (low <= high) {
            // Calculate mid point without overflow
            int mid = low + (high - low) / 2;
            
            // Convert 1D index back to 2D coordinates
            int row = mid / m;    // Row index
            int column = mid % m; // Column index

            if (mat[row][column] == target) {
                // Target found
                return true;
            } else if (mat[row][column] < target) {
                // Target is in the right half
                low = mid + 1;
            } else {
                // Target is in the left half
                high = mid - 1;
            }
        }

        // Target not found
        return false;
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

        int target = scanner.nextInt();

        System.out.println((searchMatrix(mat, target) ? "True" : "False"));

        scanner.close();
    }
}
