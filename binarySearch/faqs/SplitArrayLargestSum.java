package binarySearch.faqs;

import java.util.Scanner;

public class SplitArrayLargestSum {
    private static int countPartitions(int[] a, int n, int maxSum) {
        // Start with one partition
        int partitions = 1;
        // Current sum of the partition
        int subarraySum = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If adding the current element doesn't exceed maxSum, add it to current partition
            if ((subarraySum + a[i]) <= maxSum) {
                subarraySum += a[i];
            } else {
            // Otherwise, start a new partition
                partitions++;
                subarraySum = a[i];
            }
        }

        // Return the total number of partitions needed
        return partitions;
    }

    private static int splitArray(int[] a, int k) {
        int n = a.length;
        // Initialize low to the maximum element and high to the sum of all elements
        int low = a[0];
        int high = 0;

        // Iterate through the array to find the maximum element and the total sum
        for (int i = 0; i < n; i++) {
            // Update low to be the maximum element so far
            low = Math.max(low, a[i]);
            // Add current element to the total sum
            high += a[i];
        }

        // Perform binary search between low and high
        while (low <= high) {
            // Calculate the middle value
            int mid = low + (high - low) / 2;
            // Count how many partitions are needed with this mid as the maximum allowed sum
            int partitions = countPartitions(a, n, mid);

            // If more partitions are needed than allowed, increase the lower bound
            if (partitions > k) {
                low = mid + 1;
            } else {
                // Otherwise, try to find a smaller maximum sum
                high = mid - 1;
            }
        }

        // Return the minimum possible largest sum
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

        System.out.println(splitArray(nums, k));

        scanner.close();
    }
}
