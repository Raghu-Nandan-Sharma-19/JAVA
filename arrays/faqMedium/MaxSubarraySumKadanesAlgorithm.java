package arrays.faqMedium;

import java.util.Scanner;

public class MaxSubarraySumKadanesAlgorithm {
    private static class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            long maxSum = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                long sum = 0;
                for (int j = i; j < n; j++) {
                    sum += nums[j];
                    maxSum = Math.max(sum, maxSum);
                }
            }

            return (int) (maxSum);
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
        System.out.println(solution.maxSubArray(nums));

        scanner.close();
    }
}
