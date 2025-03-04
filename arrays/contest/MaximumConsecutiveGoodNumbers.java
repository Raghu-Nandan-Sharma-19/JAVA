package arrays.contest;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class MaximumConsecutiveGoodNumbers {
    private static class Solution {
        public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
            Set<Integer> goodSet = new HashSet<>();
            for (int num : goodNumbers) {
                goodSet.add(num);
            }

            int cnt = 0;
            int maxCnt = 0;

            for (int num : nums) {
                if (goodSet.contains(num)) {
                    cnt++;
                    maxCnt = Math.max(maxCnt, cnt);
                } else {
                    cnt = 0;
                }
            }

            return maxCnt;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] goodNumbers = new int[m];
        
        for (int i = 0; i < m; i++) {
            goodNumbers[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxConsecutiveGoodNums(nums, goodNumbers);
        System.out.println(result);

        scanner.close();
    }
}
