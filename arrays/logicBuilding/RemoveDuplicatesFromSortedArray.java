package arrays.logicBuilding;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    private class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0; // Initialize the first pointer
            
            // Iterate through the array starting from the second element
            for (int j = 1; j < nums.length; j++) {
                // If the current element is different from the last unique element
                if (nums[j] != nums[i]) {
                    nums[i + 1] = nums[j]; // Move the unique element to the next position
                    i++; // Increment the pointer for unique elements
                }
            }

            // Print the array with unique elements
            for (int j = 0; j <= i; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();

            return (i + 1); // Return the count of unique elements
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new RemoveDuplicatesFromSortedArray().new Solution();
        System.out.println(sol.removeDuplicates(nums));

        scanner.close();
    }
}
