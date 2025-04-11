package binarySearch.fundamentals;

import java.util.Scanner;

public class LowerBound {
    private static int lowerBound(int[] nums, int x) {
        // Size of the array
        int n = nums.length;
        
        // Lower bound of search space
        int low = 0;
        
        // Upper bound of search space
        int high = n - 1;
        
        // Default answer is n (index out of bounds) in case element is greater than all array elements
        int ans = n;

        while (low <= high) {
            // Calculate middle point to divide the search space
            int mid = (low + high) / 2;

            if (nums[mid] >= x) {
                // If current element is >= x, it's a potential answer
                // Update our answer and search in the left half
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < x) {
                // If current element is < x, search in the right half
                low = mid + 1;
            }
        }

        // Return the index of the first element that is >= x
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

        System.out.println(lowerBound(nums, x));

        scanner.close();
    }
}
