package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    private class Solution {
        private void printArray(int[] nums) {
            for(int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        private void reverseArray(int[] nums, int start, int end) {
            while(start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        public void rotateArray(int[] nums, int k) {
            int n = nums.length;
            k %= n;

            reverseArray(nums, 0, k-1);
            reverseArray(nums, k, n-1);
            reverseArray(nums, 0, n-1);

            printArray(nums);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        
        Solution sol = new LeftRotateArrayByKPlaces().new Solution();
        sol.rotateArray(nums, k);

        scanner.close();
    }
}
