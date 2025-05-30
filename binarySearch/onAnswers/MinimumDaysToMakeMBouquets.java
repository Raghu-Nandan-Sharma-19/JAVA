package binarySearch.onAnswers;

import java.util.Scanner;

public class MinimumDaysToMakeMBouquets {
    private static int maxElement(int[] nums) {
        // Initialize maxi to the smallest possible integer value
        int maxi = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum element
        for (var num : nums) {
            maxi = Math.max(num, maxi);
        }

        // Return the maximum element found
        return maxi;
    }

    private static int minElement(int[] nums) {
        // Initialize mini to the largest possible integer value
        int mini = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum element
        for (var num : nums) {
            mini = Math.min(num, mini);
        }

        // Return the minimum element found
        return mini;
    }
    
    private static boolean isPossible(int[] nums, int n, int day, int k, int m) {
        // Count of consecutive flowers that have bloomed by 'day'
        int cnt = 0;
        
        // Number of bouquets formed so far
        int noOfBouquets = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                // Flower has bloomed by 'day', increment consecutive count
                cnt++;
            } else {
                // Flower hasn't bloomed, calculate bouquets from previous streak
                noOfBouquets += (cnt / k);
                
                // Reset consecutive count
                cnt = 0;
            }
        }

        // Add bouquets from the last streak (if any)
        noOfBouquets += (cnt / k);

        // Return true if we can make at least 'm' bouquets
        return (noOfBouquets >= m);
    }

    private static int roseGarden(int n, int[] nums, int k, int m) {
        // If it's impossible to make m bouquets of k flowers each, return -1
        if (((long) (m) * (long) (k)) > n) return -1;

        // Find the minimum and maximum days in the array
        int mini = minElement(nums);
        int maxi = maxElement(nums);

        // Set the search range for the minimum day
        int low = mini;
        int high = maxi;

        // Binary search to find the minimum day to make m bouquets
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if it's possible to make m bouquets by 'mid' day
            if (isPossible(nums, n, mid, k, m)) {
                // Try to find a smaller possible day
                high = mid - 1;        
            } else {
                // Increase the day since it's not possible yet
                low = mid + 1;
            }
        }

        // 'low' is the minimum day required to make m bouquets
        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(roseGarden(n, nums, k, m));

        scanner.close();
    }
}
