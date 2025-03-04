package arrays.faqHard;

import java.util.Scanner;

public class MaximumProductSubarrayInArray {
    private static class Solution {
        // Method to find the maximum product subarray
        public int maxProduct(int[] nums) {
            int n = nums.length;
            long prefix = 1; // To store the product of elements from the start
            long suffix = 1; // To store the product of elements from the end
            long maxProd = Integer.MIN_VALUE; // Initialize max product to the smallest integer value

            // Traverse the array from both ends
            for (int i = 0; i < n; i++) {
                if (prefix == 0) prefix = 1; // Reset prefix if it becomes 0
                if (suffix == 0) suffix = 1; // Reset suffix if it becomes 0
                prefix *= (long) (nums[i]); // Update prefix product
                suffix *= (long) (nums[n - i - 1]); // Update suffix product
                maxProd = Math.max(maxProd, Math.max(prefix, suffix)); // Update max product
            }

            return (int) (maxProd); // Return the maximum product found
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] nums = new int[n]; 


        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums)); 

        scanner.close();
    }
}
