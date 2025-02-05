package arrays.fundamentals;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
    private class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int n = nums.length;
            int cnt = 0, maximum = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] == 1) {
                    cnt++;
                    maximum = Math.max(maximum, cnt);
                } else {
                    cnt = 0;
                }
            }

            return maximum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new MaximumConsecutiveOnes().new Solution();
        System.out.println(sol.findMaxConsecutiveOnes(nums));

        scanner.close();
    }
}
