package binarySearch.logicBuilding;

import java.util.Scanner;

public class FloorAndCeilInSortedArray {
    private static int findFloor(int[] nums, int x) {
        // Get array length
        int n = nums.length;
        
        // Initialize binary search boundaries
        int low = 0;
        int high = n - 1;
        
        // Store the floor value, -1 if not found
        int ans = -1;

        while (low <= high) {
            // Calculate middle index (prevents integer overflow)
            int mid = low + (high - low) / 2;
            
            // If current element is <= x, it's a potential floor
            if (nums[mid] <= x) {
                ans = nums[mid];  // Update floor value
                low = mid + 1;    // Look for a larger floor in the right half
            } else {
                high = mid - 1;   // Element is too large, search in left half
            }
        }

        return ans; // Return the largest element <= x (or -1 if not found)
    }

    
    private static int findCeil(int[] nums, int x) {
        // Get array length
        int n = nums.length;
        
        // Initialize binary search boundaries
        int low = 0;
        int high = n - 1;
        
        // Store the ceil value, -1 if not found
        int ans = -1;

        while (low <= high) {
            // Calculate middle index (prevents integer overflow)
            int mid = low + (high - low) / 2;

            // If current element is >= x, it's a potential ceil
            if (nums[mid] >= x) {
                ans = nums[mid];  // Update ceil value
                high = mid - 1;   // Look for a smaller ceil in the left half
            } else {
                low = mid + 1;    // Element is too small, search in right half
            }
        }

        return ans; // Return the smallest element >= x (or -1 if not found)
    }
    
    private static int[] getFloorAndCeil(int[] nums, int x) {
        // Create and return a new array with two elements:
        // Element at index 0: Floor value (largest element <= x)
        // Element at index 1: Ceiling value (smallest element >= x)
        return new int[]{findFloor(nums, x), findCeil(nums, x)};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int x = scanner.nextInt();

        for (int num : getFloorAndCeil(nums, x)) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
