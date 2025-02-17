package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByOne {
    private class Solution {
        // function to print array
        private void printArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        // function to rotate array by 1
        public void rotateArrayByOne(int[] nums) {
            // size of the array
            int n = nums.length;
            // storing the element to be rotated
            int temp = nums[0];

            // iterating through the array
            for (int i = 1; i < n; i++) {
                // updating i - 1 element with current element
                nums[i - 1] = nums[i];
            }

            // placing rotate element in last place
            nums[n - 1] = temp;

            printArray(nums);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new LeftRotateArrayByOne().new Solution();
        sol.rotateArrayByOne(nums);

        scanner.close();
    }
}
