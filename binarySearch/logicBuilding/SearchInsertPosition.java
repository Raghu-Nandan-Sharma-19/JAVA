package binarySearch.logicBuilding;

import java.util.Scanner;

public class SearchInsertPosition {
    private static int searchInsert(int[] nums, int target) {
        // Get the length of the array
        int n = nums.length;

        // Initialize low pointer for binary search
        int low = 0;

        // Initialize high pointer for binary search
        int high = n - 1;
        
        // Default answer is n (insert at the end) if target is greater than all elements
        int ans = n;

        while (low <= high) {
            // Calculate mid point to avoid overflow
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                // If current element is >= target, we found a potential insertion position
                ans = mid;
                // Look for a smaller index in the left half
                high = mid - 1;
            } else {
                // If current element < target, search in the right half
                low = mid + 1;
            }
        }

        // Return the smallest valid index where target can be inserted
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(searchInsert(nums, target));

        scanner.close();
    }
}
