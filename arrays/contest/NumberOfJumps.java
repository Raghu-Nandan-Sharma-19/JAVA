package arrays.contest;

import java.util.Scanner;

public class NumberOfJumps {
    private static class Solution {
        public int NumberOfJumps(int[] nums, int k) {
            int n = nums.length;
            int total = 0;

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + k < nums[j]) {
                        count++;
                    }
                }
                total += count;
            }

            return total;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        
        Solution solution = new Solution();
        System.out.println(solution.NumberOfJumps(nums, k));

        scanner.close();
    }
}
