package arrays.faqHard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArraysWithoutExtraSpace {
    private static class Solution {
        // Helper method to swap elements between two arrays
        private static void swap(int[] nums1, int[] nums2, int idx1, int idx2) {
            int temp = nums1[idx1];
            nums1[idx1] = nums2[idx2];
            nums2[idx2] = temp;
        }

        // Method to merge two sorted arrays without extra space
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int left = m - 1;
            int right = 0;

            // Swap elements to ensure nums1 contains the smallest elements
            while (left >= 0 && right < n) {
                if (nums1[left] > nums2[right]) {
                    swap(nums1, nums2, left, right);
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            // Sort both arrays
            Arrays.sort(nums1, 0, m);
            Arrays.sort(nums2); 

            // Copy elements from nums2 to nums1
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[i - m];
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        for (int i = 0; i < (m + n); i++) {
            System.out.print(nums1[i] + " ");
        }

        scanner.close();
    }
}
