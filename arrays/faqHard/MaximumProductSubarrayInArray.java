package arrays.faqHard;

import java.util.Scanner;

public class MaximumProductSubarrayInArray {
    private static class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length;
            int maxProd = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int prod = 1;
                for (int j = i; j < n; j++) {
                    prod *= nums[j];
                }
                maxProd = Math.max(maxProd, prod);
            }

            return maxProd;
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
        System.out.println(solution.maxProduct(nums));

        scanner.close();
    }
}
