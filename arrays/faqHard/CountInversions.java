package arrays.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountInversions {
    private static class Solution {
        // Merges two subarrays of nums[] and counts inversions
        private long merge(int[] nums, int low, int mid, int high) {
            List<Integer> temp = new ArrayList<>();
            long count = 0;
            int left = low;
            int right = mid + 1;

            // Merge the two subarrays while counting inversions
            while (left <= mid && right <= high) {
                if (nums[left] <= nums[right]) {
                    temp.add(nums[left]);
                    left++;
                } else {
                    temp.add(nums[right]);
                    count += (mid - left + 1); // Count inversions
                    right++;
                }
            }

            // Copy remaining elements of left subarray, if any
            while (left <= mid) {
                temp.add(nums[left]);
                left++;
            }

            // Copy remaining elements of right subarray, if any
            while (right <= high) {
                temp.add(nums[right]);
                right++;
            }

            // Copy the merged subarray back into the original array
            for (int i = low; i <= high; i++) {
                nums[i] = temp.get(i - low);
            }

            return count;
        }

        // Recursively sorts the array and counts inversions
        private long mergeSort(int[] nums, int low, int high) {
            long count = 0;
            if (low >= high) return count;
            int mid = (low + high) / 2;
            count += mergeSort(nums, low, mid); // Count inversions in left subarray
            count += mergeSort(nums, mid + 1, high); // Count inversions in right subarray
            count += merge(nums, low, mid, high); // Count split inversions
            return count;
        }

        // Returns the number of inversions in the array
        public long numberOfInversions(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
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
        System.out.println(solution.numberOfInversions(nums));

        scanner.close();
    }
}
