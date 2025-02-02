package arrays.faqMedium;

import java.util.Scanner;

public class RearrangeElementsBySign {
    private static class Solution {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int positiveIndex = 0;
            int negativeIndex = 1;
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) {
                    ans[positiveIndex] = nums[i];
                    positiveIndex += 2;
                } else {
                    ans[negativeIndex] = nums[i];
                    negativeIndex += 2;
                }
            }

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
