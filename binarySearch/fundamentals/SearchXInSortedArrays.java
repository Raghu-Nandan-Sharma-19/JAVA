package binarySearch.fundamentals;

import java.util.Scanner;

public class SearchXInSortedArrays {
    private static int recursiveSearch(int[] nums, int low, int high, int x) {
        // Base case: if the search space is empty
        if (low > high) {
            return -1;
        }

        // Calculate middle index to avoid overflow
        int mid = low + (high - low) / 2;

        // Check if middle element is the target
        if (nums[mid] == x) {
            return mid;
        } else if (nums[mid] > x) {
            // If middle element is greater, search in left half
            return recursiveSearch(nums, low, mid - 1, x);
        }

        // If middle element is smaller, search in right half
        return recursiveSearch(nums, mid + 1, high, x);
    }
    
    private static int recursiveBinarySearch(int[] nums, int x) {
        return recursiveSearch(nums, 0, nums.length - 1, x);
    }

    private static int search(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            // Calculate middle index
            int mid = (low + high) / 2;

            // Check if middle element is the target
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] > x) {
                // If middle element is greater, search in left half
                high = mid - 1;
            } else {
                // If middle element is smaller, search in right half
                low = mid + 1;
            }
        }

        // Element not found
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }   

        int x = scanner.nextInt();

        System.out.println(search(nums, x));
        
        System.out.println(recursiveBinarySearch(nums, x));

        scanner.close();
    }
}
