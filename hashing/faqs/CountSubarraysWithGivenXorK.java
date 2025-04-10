package hashing.faqs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithGivenXorK {
    private static int subarraysWithXorK(int[] nums, int k) {
        // Length of the array
        int n = nums.length;
        
        // Variable to keep track of the running XOR
        int xr = 0;
        
        // Map to store frequency of XOR values seen so far
        Map<Integer, Integer> map = new HashMap<>();
        
        // Initialize with 0 XOR having count 1
        map.put(xr, map.getOrDefault(xr, 0) + 1);
        
        // Counter for subarrays with XOR equal to k
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // Update running XOR with current element
            xr ^= nums[i];

            // Calculate XOR value needed to achieve target k
            int x = xr ^ k;
            
            // Add count of subarrays ending at current position with XOR k
            cnt += map.getOrDefault(x, 0);
            
            // Update frequency of current running XOR
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(subarraysWithXorK(nums, k));

        scanner.close();
    }
}
