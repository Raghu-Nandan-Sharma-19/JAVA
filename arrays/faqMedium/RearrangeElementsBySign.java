package arrays.faqMedium;

import java.util.Scanner;

public class RearrangeElementsBySign {
    private static class Solution {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            // index of positive and negative elements
            int positiveIndex = 0;
            int negativeIndex = 1;
            // ans array to store rearranged elements
            int[] ans = new int[n];

            // iterating through the array
            for (int i = 0; i < n; i++) {
                // if current element is positive
                if (nums[i] > 0) {
                    // add current element to ans[positiveIndex]
                    ans[positiveIndex] = nums[i];
                    // increment positive index to next positive index
                    positiveIndex += 2;
                } else {
                    // add current element to ans[negativeIndex]
                    ans[negativeIndex] = nums[i];
                    // increment negative index to next negative index
                    negativeIndex += 2;
                }
            }

            // return the ans array
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        int[] ans = sol.rearrangeArray(nums);
        for (int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
