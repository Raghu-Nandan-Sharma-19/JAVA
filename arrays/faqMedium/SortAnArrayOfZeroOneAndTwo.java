package arrays.faqMedium;

import java.util.Scanner;

public class SortAnArrayOfZeroOneAndTwo {
    private static class Solution {
        // method to swap two elements of array
        private void swap(int[] nums, int index1, int index2) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }

        public void sortZeroOneTwo(int[] nums) {
            // low, mid and high pointers to sort array
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            // iterating till mid is less than equal to high
            while (mid <= high) {
                // mid element is equal to 0
                if (nums[mid] == 0) {
                    // swap element at low and mid
                    swap(nums, low, mid);
                    // increment low and mid
                    low++;
                    mid++;
                } else if (nums[mid] == 1) { // mid element is equal to 1
                    // increment mid
                    mid++;
                } else { // mid element is equal to 2
                    // swap element at mid and high
                    swap(nums, mid, high);
                    // decrement high
                    high--;
                }
            }
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
        solution.sortZeroOneTwo(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        } 
        System.out.println();

        scanner.close();
    }
}
