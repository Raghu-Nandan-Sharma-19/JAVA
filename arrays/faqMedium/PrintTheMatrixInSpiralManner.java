package arrays.faqMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintTheMatrixInSpiralManner {
    private static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            // size of row and column
            int n = matrix.length;
            int m = matrix[0].length;

            // left, right, top and bottom pointers to iterate
            int left = 0;
            int right = m - 1;
            int top = 0;
            int bottom = n - 1;

            // list to store elements in spiral
            List<Integer> spiral = new ArrayList<>();

            /*  iteraing till top is less than equal to bottom and
             *  left is less than equal to right
             */
            while (top <= bottom && left <= right) {
                // iterating from left to right
                for (int i = left; i <= right; i++) {
                    // adding the element at top and current index
                    spiral.add(matrix[top][i]);
                }
                // incrementing the top pointer
                top++;

                // iterating from top to bottom
                for (int i = top; i <= bottom; i++) {
                    // adding the element at current and right index 
                    spiral.add(matrix[i][right]);
                }
                // decrementing the right pointer
                right--;

                // checking if top is less than equal to bottom
                if (top <= bottom) {
                    // iterating from right to left
                    for (int i = right; i >= left; i--) {
                        // adding the element at bottom and current index 
                        spiral.add(matrix[bottom][i]);
                    }
                    // decrementing the bottom pointer
                    bottom--;
                }

                // checking if left is less than equal to right
                if (left <= right) {
                    // iterating from bottom to top
                    for (int i = bottom; i >= top; i--) {
                        // adding the element at current and left index
                        spiral.add(matrix[i][left]);
                    }
                    // incrementing the left pointer
                    left++;
                }
            }

            // returning the spiral matrix
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
