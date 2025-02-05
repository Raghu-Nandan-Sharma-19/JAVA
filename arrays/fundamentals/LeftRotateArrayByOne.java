package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByOne {
    private class Solution {
        private void printArray(int[] nums) {
            for(int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        public void rotateArrayByOne(int[] nums) {
            int n = nums.length;
            int temp = nums[0];

            for(int i = 1; i < n; i++) {
                nums[i-1] = nums[i];
            }

            nums[n-1] = temp;

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

        Solution sol = new LeftRotateArrayByOne().new Solution();
        sol.rotateArrayByOne(nums);

        scanner.close();
    }
}
