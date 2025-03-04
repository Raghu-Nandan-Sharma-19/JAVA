package arrays.faqHard;

import java.util.Scanner;

public class FindTheMissingAndRepeatingNumber {
    private static class Solution {
        public int[] findMissingRepeatingNumbers(int[] nums) {
            int n = nums.length;
            int missing = -1;
            int repeating = -1;

            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == i) {
                        count++;
                    }
                }

                if (count == 0) {
                    missing = i;
                } else if (count == 2) {
                    repeating = i;
                }
            }

            return new int[]{repeating, missing};
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
        for (int num : solution.findMissingRepeatingNumbers(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
