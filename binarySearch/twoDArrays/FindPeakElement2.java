package binarySearch.twoDArrays;

import java.util.Scanner;

public class FindPeakElement2 {
    private static int maxElement(int[][] mat, int n, int column) {
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            if (mat[i][column] > max) {
                max = mat[i][column];
                idx = i;
            }
        }

        return idx;
    }

    private static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = maxElement(mat, n, mid);

            int left = ((mid - 1) >= 0) ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = ((mid + 1) < m) ? mat[row][mid + 1] : Integer.MIN_VALUE;

            if ((mat[row][mid] > left) && (mat[row][mid] > right)) {
                return new int[]{row, mid};
            } else if (left > mat[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
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

        for (var num : findPeakGrid(mat)) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
