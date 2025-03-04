package arrays.faqHard;

import java.util.Scanner;

public class MergeTwoSortedArraysWithoutExtraSpace {
    private static class Solution {
        // Helper method to swap elements if the element in the first array is greater
        private void swapIfGreater(int[] arr1, int[] arr2, int idx1, int idx2) {
            if (arr1[idx1] > arr2[idx2]) {
                int temp = arr1[idx1];
                arr1[idx1] = arr2[idx2];
                arr2[idx2] = temp;
            }
        }

        // Method to merge two sorted arrays without extra space
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int length = n + m;
            int gap = (length / 2) + (length % 2);

            // Perform the gap algorithm to merge arrays
            while (gap > 0) {
                int left = 0;
                int right = left + gap;
                
                while (right < length) {
                    if (left < m && right >= m) {
                        // Compare and swap elements between nums1 and nums2
                        swapIfGreater(nums1, nums2, left, right - m);
                    } else if (left >= m) {
                        // Compare and swap elements within nums2
                        swapIfGreater(nums2, nums2, left - m, right - m);
                    } else {
                        // Compare and swap elements within nums1
                        swapIfGreater(nums1, nums1, left, right);
                    }
                   
                    left++;
                    right++;
                }
                
                if (gap == 1) {
                    break;
                }

                gap = (gap / 2) + (gap % 2);
            }

            // Copy the merged elements from nums2 to nums1
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
