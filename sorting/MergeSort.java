package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    private class Solution {
        private void merge(int[] nums, int low, int mid, int high) {
            List<Integer> temp = new ArrayList<>();
            int left = low, right = mid+1;

            while(left <= mid && right <= high) {
                if(nums[left] <= nums[right]) {
                    temp.add(nums[left]);
                    left++;
                } else {
                    temp.add(nums[right]);
                    right++;
                }
            }

            while(left <= mid) {
                temp.add(nums[left]);
                left++;
            }

            while(right <= high) {
                temp.add(nums[right]);
                right++;
            }

            for(int i = low; i <= high; i++) {
                nums[i] = temp.get(i-low);
            }
        }

        private void mergeSortHelper(int[] nums, int low, int high) {
            if(low >= high) return;
            int mid = low+(high-low)/2;
            mergeSortHelper(nums, low, mid);
            mergeSortHelper(nums, mid+1, high);
            merge(nums, low, mid, high);
        }

        public int[] mergeSort(int[] nums) {
            int n = nums.length;
            mergeSortHelper(nums, 0, n-1);
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

        Solution sol = new MergeSort().new Solution();
        int[] ans = sol.mergeSort(nums);
        for(var el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
