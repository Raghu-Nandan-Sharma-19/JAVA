package arrays.faqHard;

import java.util.Scanner;

public class CountInversions {
    private static class Solution {
        public long numberOfInversions(int[] nums) {
            int n = nums.length;
            long count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] > nums[j]) {
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
        System.out.println(solution.numberOfInversions(nums));

        scanner.close();
    }
}
