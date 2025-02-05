package arrays.fundamentals;

import java.util.Scanner;

public class LargestElement {
    private class Solution {
        public int largestElement(int[] nums) {
            int n = nums.length;
            int largest = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++) {
                if(nums[i] > largest) largest = nums[i];
            }

            return largest;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new LargestElement().new Solution();
        System.out.println(sol.largestElement(nums));

        scanner.close();
    }
}
