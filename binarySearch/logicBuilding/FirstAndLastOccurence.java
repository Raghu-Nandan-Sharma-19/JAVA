package binarySearch.logicBuilding;

import java.util.Scanner;

public class FirstAndLastOccurence {
    private static int firstOccurence(int[] nums, int n, int target) {
        // Initialize search boundaries
        int low = 0;
        int high = n - 1;
        
        // To store the first occurrence of target
        int ans = -1;

        while (low <= high) {
            // Calculate middle index to avoid overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                // Store current position and
                // continue searching on left side for first occurrence
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                // Target is in right half
                low = mid + 1;
            } else {
                // Target is in left half
                high = mid - 1;
            }
        }

        // Return the first occurrence index (-1 if not found)
        return ans;
    }

    private static int lastOccurence(int[] nums, int n, int target) {
        // Initialize search boundaries
        int low = 0;
        int high = n - 1;

        // To store the last occurrence of target
        int ans = -1;

        while (low <= high) {
            // Calculate middle index to avoid overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                // Store current position and
                // continue searching on right side for last occurrence
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                // Target is in right half
                low = mid + 1;
            } else {
                // Target is in left half
                high = mid - 1;
            }
        }

        // Return the last occurrence index (-1 if not found)
        return ans;
    }

    private static int[] searchRange(int[] nums, int target) {
        // Get the length of the input array
        int n = nums.length;

        // Find the first occurrence of target in the array
        int first = firstOccurence(nums, n, target);

        // Find the last occurrence of target in the array
        int last = lastOccurence(nums, n, target);

        // If target doesn't exist in the array, return [-1, -1]
        if (first == -1) {
            return new int[]{-1, -1};
        }

        // Return array containing first and last positions
        return new int[]{first, last};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        for (int num : searchRange(nums, target)) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
