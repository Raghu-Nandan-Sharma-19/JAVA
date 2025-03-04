package arrays.faqMedium;

import java.util.Scanner;

public class MaxSubarraySumKadanesAlgorithm {
    private static class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            // variables to store sum and max sum
            long maxSum = Long.MIN_VALUE;
            long sum = 0;

            // iterating through the array
            for (int i = 0; i < n; i++) {
                // add current element of array to sum
                sum += nums[i];
                
                // if sum becomes greater than max sum update max sum with sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // if sum becomes negative update sum to zero
                if (sum < 0) {
                    sum = 0;
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
