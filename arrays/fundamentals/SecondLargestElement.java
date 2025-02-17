package arrays.fundamentals;

import java.util.Scanner;

public class SecondLargestElement {
    // Inner class to encapsulate the solution logic
    private class Solution {
        // Method to find the second largest element in the array
        public int secondLargestElement(int[] nums) {
            int n = nums.length;
            int largest = -1, secondLargest = -1;

            // Iterate through the array to find the largest and second largest elements
            for (int i = 0; i < n; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest; // Update second largest
                    largest = nums[i]; // Update largest
                } else if (nums[i] > secondLargest && nums[i] != largest) {
                    secondLargest = nums[i]; // Update second largest if current element is not equal to largest
                }
            }

            return secondLargest; // Return the second largest element
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new SecondLargestElement().new Solution();
        System.out.println(sol.secondLargestElement(nums));

        scanner.close();
    }
}
