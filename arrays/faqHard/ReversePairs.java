package arrays.faqHard;

import java.util.Scanner;

public class ReversePairs {
    private static class Solution {
        public int reversePairs(int[] nums) {
            int n = nums.length;
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] > 2 * nums[j]) {
                        count++;
                    }
                }
            }

            return count;
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
