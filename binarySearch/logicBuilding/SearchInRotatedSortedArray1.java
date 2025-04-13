package binarySearch.logicBuilding;

import java.util.Scanner;

public class SearchInRotatedSortedArray1 {
    private static int search(int[] nums, int k) {
        // Get array length
        int n = nums.length;
        // Initialize pointers for binary search
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            // Calculate middle index to avoid overflow
            int mid = low + (high - low) / 2;

            // Check if middle element is the target
            if (nums[mid] == k) {
                return mid;
            } else if (nums[low] <= nums[mid]) { // Check if left half is sorted
                // Check if target lies in the sorted left half
                if (nums[low] <= k && k <= nums[mid]) {
                    high = mid - 1;  // Search in left half
                } else {
                    low = mid + 1;   // Search in right half
                }
            } else { // Right half must be sorted
                // Check if target lies in the sorted right half
                if (nums[mid] <= k && k <= nums[high]) {
                    low = mid + 1;   // Search in right half
                } else {
                    high = mid - 1;  // Search in left half
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(search(nums, k));

        scanner.close();
    }
}
