package arrays.faqHard;

import java.util.Scanner;

public class FindTheMissingAndRepeatingNumber {
    private static class Solution {
        /**
         * Finds the missing and repeating numbers in the array.
         * @param nums The input array containing numbers from 1 to n with one missing and one repeating.
         * @return An array containing the repeating number and the missing number.
         */
        public int[] findMissingRepeatingNumbers(int[] nums) {
            int n = nums.length;
            // Calculate the sum of first n natural numbers
            long sN = (n * (n + 1)) / 2;
            // Calculate the sum of squares of first n natural numbers
            long s2N = (n * (n + 1) * (2 * n + 1)) / 6;
            long s = 0;
            long s2 = 0;

            // Calculate the sum and sum of squares of the array elements
            for (int i = 0; i < n; i++) {
                s += nums[i];
                s2 += ((long) (nums[i]) * (long) (nums[i]));
            }

            // Calculate the difference between the expected and actual sums
            long val1 = s - sN;
            // Calculate the difference between the expected and actual sum of squares
            long val2 = s2 - s2N;

            // Divide val2 by val1 to get the sum of the missing and repeating numbers
            val2 = val2 / val1;
            
            // Calculate the repeating number
            long x = (val1 + val2) / 2;
            // Calculate the missing number
            long y = x - val1;
            
            // Return the repeating and missing numbers
            return new int[]{(int) (x), (int) (y)};
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        for (int num : solution.findMissingRepeatingNumbers(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
