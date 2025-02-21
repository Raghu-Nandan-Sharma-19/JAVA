package arrays.faqMedium;

import java.util.Scanner;

public class SortAnArrayOfZeroOneAndTwo {
    private static class Solution {
        public void sortZeroOneTwo(int[] nums) {
            int n = nums.length;
            int zeroes = 0;
            int ones = 0;
            int twos = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    zeroes++;
                } else if (nums[i] == 1) {
                    ones++;
                } else {
                    twos++;
                }
            }

            for (int i = 0; i < zeroes; i++) {
                nums[i] = 0;
            }

            for (int i = zeroes; i < zeroes + ones; i++) {
                nums[i] = 1;
            }

            for (int i = zeroes + ones; i < zeroes + ones + twos; i++) {
                nums[i] = 2;
            }
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
        solution.sortZeroOneTwo(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        } 
        System.out.println();

        scanner.close();
    }
}
