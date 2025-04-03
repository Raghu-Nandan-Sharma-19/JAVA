package hashing.faqs;

import java.util.Scanner;

public class LongestSubarrayWithSumK {
    private static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int longest = 0;

        for (int i = 0; i  < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            } 
        }

        return longest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }   

        int k = scanner.nextInt();

        System.out.println(longestSubarray(nums, k));

        scanner.close();
    }
}
