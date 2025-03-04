package arrays.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePairs {
    private static class Solution {
        // Merges two sorted subarrays of nums[].
        // First subarray is nums[low..mid]
        // Second subarray is nums[mid+1..high]
        private void merge(int[] nums, int low, int mid, int high) {
            List<Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid + 1;

            // Merge the two subarrays into temp
            while (left <= mid && right <= high) {
                if (nums[left] <= nums[right]) {
                    temp.add(nums[left]);
                    left++;
                } else {
                    temp.add(nums[right]);
                    right++;
                }
            }

            // Copy the remaining elements of left subarray, if any
            while (left <= mid) {
                temp.add(nums[left]);
                left++;
            }

            // Copy the remaining elements of right subarray, if any
            while (right <= high) {
                temp.add(nums[right]);
                right++;
            }

            // Copy the merged subarray into the original array
            for (int i = low; i <= high; i++) {
                nums[i] = temp.get(i - low);
            }
        }

        // Counts the number of important reverse pairs in the array
        private int countPair(int[] nums, int low, int mid, int high) {
            int count = 0;
            int right = mid + 1;

            // Count pairs where nums[i] > 2 * nums[j]
            for (int i = low; i <= mid; i++) {
                while (right <= high && nums[i] > 2 * nums[right]) {
                    right++;
                }
                count += (right - (mid + 1));
            }

            return count;
        }

        // Sorts the array and returns the count of important reverse pairs
        private int mergeSort(int[] nums, int low, int high) {
            int count = 0;

            if (low >= high) return count;
            int mid = (low + high) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += countPair(nums, low, mid, high);
            merge(nums, low, mid, high);

            return count;
        }

        // Main function to count important reverse pairs
        public int reversePairs(int[] nums) {
            int n = nums.length;
            return mergeSort(nums, 0, n - 1);
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
        System.out.println(solution.reversePairs(nums));

        scanner.close();
    }
}
