package arrays.faqMedium;

import java.util.Scanner;

public class NextPermutation {
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    private static void reverse(int[] nums, int idx1, int idx2) {
        while (idx1 < idx2) {
            swap(nums, idx1, idx2);
            idx1++;
            idx2--;
        }
    }

    private static void nextPermutation(int[] nums) {
        int n = nums.length;

        int idx = -1;

        // Find the first index from the end where nums[i] < nums[i + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        /*
         * If no such index is found, the array is in descending order.
         * Reverse the whole array to get the smallest permutation.
         */
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the first index from the end where nums[i] > nums[idx] and swap
        for (int i = n - 1; i >= idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        
        // Reverse the subarray to the right of idx to get the next permutation
        reverse(nums, idx + 1, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        nextPermutation(nums);

        for (var num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
