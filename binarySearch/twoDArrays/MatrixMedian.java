package binarySearch.twoDArrays;

import java.util.Scanner;

public class MatrixMedian {
    private static int upperBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int countSmallEqual(int[][] matrix, int n, int m, int x) {
        // Initialize a counter to keep track of elements <= x
        int cnt = 0;

        // Iterate through each row of the matrix
        for (int i = 0; i < n; i++) {
            // For each row, count elements <= x using upperBound
            // upperBound returns the position of first element > x
            // so it equals the count of elements <= x
            cnt += upperBound(matrix[i], m, x);
        }

        // Return the total count of elements <= x in the entire matrix
        return cnt;
    }

    private static int findMedian(int[][] matrix) {
        // Get matrix dimensions
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;     // Number of columns
        
        // Initialize search range
        int low = Integer.MAX_VALUE;  // Lower bound for binary search
        int high = Integer.MIN_VALUE; // Upper bound for binary search

        // Find the minimum and maximum values in the matrix
        // Since each row is sorted, we can look at first and last elements of each row
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);       // Minimum element is the smallest first element
            high = Math.max(high, matrix[i][m - 1]); // Maximum element is the largest last element
        }

        // The median is the (n*m)/2 th element in the sorted matrix
        int req = (n * m) / 2;

        // Binary search to find the median value
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Calculate mid value to avoid overflow
            
            // Count how many elements are less than or equal to mid
            int smallEqual = countSmallEqual(matrix, n, m, mid);

            // Adjust search space based on count
            if (smallEqual <= req) {
                // If there are fewer elements than required, look in the right half
                low = mid + 1;
            } else {
                // If there are more elements than required, look in the left half
                high = mid - 1;
            }
        }

        // After binary search completes, 'low' contains the median value
        return low;
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
