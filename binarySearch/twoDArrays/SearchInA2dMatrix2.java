package binarySearch.twoDArrays;

import java.util.Scanner;

public class SearchInA2dMatrix2 {
    private static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
    
    private static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            if (binarySearch(matrix[i], target)) {
                return true;
            }
        }

        return false;
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
