package binarySearch.onAnswers;

import java.util.Scanner;

public class FindTheSmallestDivisor {
    private static int maxElement(int[] nums, int n) {
        // Initialize maxi with the first element of the array
        int maxi = nums[0];

        // Iterate through the rest of the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (nums[i] > maxi) {
                maxi = nums[i]; // Update maxi if a larger element is found
            }
        }

        // Return the maximum element found in the array
        return maxi;
    }

    private static int sumByDivisor(int[] nums, int divisor, int n) {
        int sum = 0;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Divide each element by the divisor, take the ceiling, and add to sum
            sum += Math.ceil((double) (nums[i]) / (double) (divisor));
        }

        // Return the total sum after division and ceiling
        return sum;
    }

    private static int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        int maxi = maxElement(nums, n);

        // Initialize the search range for the divisor
        int low = 1;
        int high = maxi;

        // Binary search to find the smallest divisor
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = sumByDivisor(nums, mid, n);

            // If the sum is within the limit, try a smaller divisor
            if (val <= limit) {
                high = mid - 1;
            } else {
                // Otherwise, try a larger divisor
                low = mid + 1;
            }
        }

        // 'low' is the smallest divisor such that the sum is <= limit
        return low;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int limit = scanner.nextInt();

        System.out.println(smallestDivisor(nums, limit));

        scanner.close();
    }
}
