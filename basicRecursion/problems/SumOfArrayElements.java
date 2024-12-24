package basicRecursion.problems;

import java.util.Scanner;

public class SumOfArrayElements {
    private class Solution {
        private int sum(int left, int[] nums, int n) {
            if(left >= n) {
                return 0;
            }
            return nums[left]+sum(left+1, nums, n);
        }

        public int arraySum(int[] nums) {
            int n = nums.length;
            return sum(0, nums, n);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new SumOfArrayElements().new Solution();
        System.out.println(sol.arraySum(nums));

        scanner.close();
    }
}
