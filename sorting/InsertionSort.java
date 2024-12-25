package sorting;

import java.util.Scanner;

public class InsertionSort {
    private class Solution {
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        public int[] insertionSort(int[] nums) {
            int n = nums.length;

            for(int i = 0; i < n; i++) {
                int j = i;
                while(j > 0 && nums[j-1] > nums[j]) {
                    swap(nums, j-1, j);
                    j--;
                }
            }

            return nums;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new InsertionSort().new Solution();
        int[] ans = sol.insertionSort(nums);
        for(int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
