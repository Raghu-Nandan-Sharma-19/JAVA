package binarySearch.fundamentals;

import java.util.Scanner;

public class UpperBound {
    private static int upperBound(int[] nums, int x) {
        // Length of the input array
        int n = nums.length;

        // Initialize low pointer to start of array
        int low = 0;
        
        // Initialize high pointer to end of array
        int high = n - 1;
        
        // Default answer is n (index after the last element)
        int ans = n;

        // Binary search loop
        while (low <= high) {
            // Calculate middle index to avoid overflow
            int mid = low + (high - low) / 2;

            // If middle element is greater than target
            if (nums[mid] > x) {
                // Update answer to current position
                ans = mid;
                // Search in the left half
                high = mid - 1;
            } else {
                // If middle element is less than or equal to target
                // Search in the right half
                low = mid + 1;
            }
        }

        // Return the position of the first element greater than x
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }   

        int x = scanner.nextInt();

        System.out.println(upperBound(nums, x));

        scanner.close();
    }
}
