package binarySearch.twoDArrays;

import java.util.Scanner;

public class FindRowWithMaxOnes {
    private static int lowerBound(int[] arr, int n, int x) {
        // Initialize search boundaries
        int low = 0;
        int high = n - 1;
        // Default answer if element is not found (points to position after the array)
        int ans = n;

        while (low <= high) {
            // Calculate mid point to avoid integer overflow
            int mid = low + (high - low) / 2;

            // If current element is greater than or equal to target
            if (arr[mid] >= x) {
                // Update answer to current position
                ans = mid;
                // Search in the left half
                high = mid - 1;
            } else {
                // If current element is less than target, search in right half
                low = mid + 1;
            }
        }

        // Return the position of the first occurrence of x or n if not present
        return ans;
    }

    private static int rowWithMax1s(int[][] mat) {
        // Get the dimensions of the matrix
        int n = mat.length;
        int m = mat[0].length;

        // Variables to track the maximum number of ones and its row index
        int maxOnes = 0;
        int idx = -1;

        // Iterate through each row
        for (int i = 0; i < n; i++) {
            // Find the index of first '1' using binary search and calculate number
            // of ones
            int countOnes = m - lowerBound(mat[i], m, 1);

            // Update maximum if current row has more ones
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                idx = i;
            }
        }

        // Return the row index with maximum number of ones
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
