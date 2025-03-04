package arrays.faqHard;

import java.util.Scanner;

public class MajorityElement1 {
    private static class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int el = Integer.MIN_VALUE;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (cnt == 0) {
                    el = nums[i];
                    cnt = 1;
                } else if (el == nums[i]) {
                    cnt++;
                } else {
                    cnt--;
                }
            }

            cnt = 0;
            for (int i = 0; i < n; i++) {
                if (el == nums[i]) {
                    cnt++;
                }
            }

            return cnt > (n / 2) ? el : -1;
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
        System.out.println(solution.majorityElement(nums));
        
        scanner.close();
    }
}
