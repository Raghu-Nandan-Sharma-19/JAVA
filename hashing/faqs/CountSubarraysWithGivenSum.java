package hashing.faqs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithGivenSum {
    private static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // Map to store prefix sum and its frequency
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int subarrayCount = 0;

        // Initialize with 0 sum occurring once (empty subarray)
        map.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            // Add current element to running sum
            prefixSum += nums[i];
            
            // Calculate sum to find (prefix - k = earlier prefix)
            int sumToRemove = prefixSum - k;
            
            // Add count of subarrays ending at current position
            subarrayCount += map.getOrDefault(sumToRemove, 0);
            
            // Update prefix sum frequency in the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return subarrayCount;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(subarraySum(nums, k));

        scanner.close();
    }
}
