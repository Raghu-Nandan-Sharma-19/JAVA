package sorting;

import java.util.Scanner;

public class QuickSort {
    private class Solution {
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        private int partition(int[] nums, int low, int high) {
            int pivot = nums[low];
            int i = low, j = high;

            while(i < j) {
                while(nums[i] <= pivot && i <= high-1) {
                    i++;
                }

                while(nums[j] > pivot && j >= low+1) {
                    j--;
                }

                if(i < j) {
                    swap(nums, i, j);
                }
            }

            swap(nums, low, j);

            return j;
        }

        private void quickSortHelper(int[] nums, int low, int high) {
            if(low < high) {
                int partitionIndex = partition(nums, low, high);
                quickSortHelper(nums, low, partitionIndex-1);
                quickSortHelper(nums, partitionIndex+1, high);  
            }
        }

        public int[] quickSort(int[] nums) {
            int n = nums.length;
            quickSortHelper(nums, 0, n-1);
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

        Solution sol = new QuickSort().new Solution();
        int[] ans = sol.quickSort(nums);
        for(int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
