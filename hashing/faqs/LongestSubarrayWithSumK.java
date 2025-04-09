package hashing.faqs;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    // optimal for when array contains positive + negative element 
    private static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        HashMap<Long, Integer> prefixSum = new HashMap<>(); // Map to store prefix sums and their first occurrence index
        long sum = 0; // Variable to store the running sum
        int maxLen = 0; // Variable to store the maximum length of subarray with sum k

        for (int i = 0; i < n; i++) {
            sum += nums[i]; // Add the current element to the running sum

            // Check if the running sum itself equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1); // Update maxLen if the entire subarray from 0 to i has sum k
            }

            long rem = sum - k; // Calculate the remaining sum needed to form k
            
            // Check if the remaining sum exists in the prefixSum map
            if (prefixSum.containsKey(rem)) {
                int len = i - prefixSum.get(rem); // Calculate the length of the subarray
                maxLen = Math.max(maxLen, len); // Update maxLen if this subarray is longer
            }

            // Store the current running sum in the map if it's not already present
            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
        }

        return maxLen; // Return the maximum length of subarray with sum k
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
