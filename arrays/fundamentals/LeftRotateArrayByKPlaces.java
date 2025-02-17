package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    private class Solution {
        // function to print array
        private void printArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        // function to swap elements of array
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        // function to reverse array
        private void reverseArray(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        // function to rotate array by k places
        public void rotateArray(int[] nums, int k) {
            // size of the array
            int n = nums.length;
            // for avoiding unnecessary rotations
            k %= n;

            // reversing from 0 to k - 1
            reverseArray(nums, 0, k - 1);
            // reversing from k to n - 1
            reverseArray(nums, k, n - 1);
            // reversing from 0 to n - 1
            reverseArray(nums, 0, n - 1);

            // printing the array
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

        int k = scanner.nextInt();
        
        Solution sol = new LeftRotateArrayByKPlaces().new Solution();
        sol.rotateArray(nums, k);

        scanner.close();
    }
}
