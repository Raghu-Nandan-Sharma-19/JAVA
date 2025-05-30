package binarySearch.onAnswers;

import java.util.Scanner;

public class KokoEatingBananas {
    private static int maxElement(int[] nums, int n) {
        // Initialize maxi to the smallest possible integer value
        int maxi = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum element
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        // Return the maximum element found
        return maxi;
    }
    
    private static int calculateTotalHours(int[] nums, int n, int hour) {
        int totalHours = 0;

        // Iterate through each pile of bananas
        for (int i = 0; i < n; i++) {
            // Calculate the number of hours needed to eat the current pile at the given speed
            // Use Math.ceil to round up since Koko can't eat partial bananas in an hour
            totalHours += Math.ceil((double) (nums[i]) / (double) (hour));
        }

        // Return the total hours required to eat all piles at the given speed
        return totalHours;
    }

    private static int minimumRateToEatBananas(int[] nums, int h) {
        int n = nums.length;

        // Find the maximum number of bananas in any pile
        int maxi = maxElement(nums, n); 

        // Minimum and Maximum possible eating speed
        int low = 1;
        int high = maxi;

        // Binary search to find the minimum eating speed
        while (low <= high) {
            // Current candidate speed
            int mid = low + (high - low) / 2;

            // Calculate hours needed at this speed
            int reqTime = calculateTotalHours(nums, n, mid); 

            if (reqTime <= h) {
                // If Koko can finish in h hours or less, try a slower speed
                high = mid - 1;
            } else {
                // If not, increase the speed
                low = mid + 1;
            }
        }

        return low; // The minimum speed at which Koko can eat all bananas in h hours
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int h = scanner.nextInt();

        System.out.println(minimumRateToEatBananas(nums, h));

        scanner.close();
    }
}
