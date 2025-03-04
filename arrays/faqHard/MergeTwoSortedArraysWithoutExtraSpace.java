package arrays.faqHard;

import java.util.Scanner;

public class MergeTwoSortedArraysWithoutExtraSpace {
    private static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] merged = new int[n + m];
            int left = 0;
            int right = 0;
            int index = 0;

            while (left < m && right < n) {
                if (nums1[left] <= nums2[right]) {
                    merged[index++] = nums1[left++];
                } else {
                    merged[index++] = nums2[right++];
                }
            }

            while (left < m) {
                merged[index++] = nums1[left++];
            }

            while (right < n) {
                merged[index++] = nums2[right++];
            }

            for (int i = 0; i < (m + n); i++) {
                nums1[i] = merged[i];
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
