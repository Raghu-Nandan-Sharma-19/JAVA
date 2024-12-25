package sorting;

import java.util.Scanner;

public class SelectionSort {
    private class Solution {
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        public int[] selectionSort(int[] nums) {
            int n = nums.length;
            
            for(int i = 0; i < n-1; i++) {
                int minIndex = i;
                for(int j = i; j < n; j++) {
                    if(nums[j] < nums[minIndex]) {
                        minIndex = j;
                    }
                }
                swap(nums, minIndex, i);
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

        Solution sol = new SelectionSort().new Solution();
        int[] ans = sol.selectionSort(nums);
        for(int el : ans) {
            System.out.print(el + " ");
        }

        scanner.close();
    }
}
