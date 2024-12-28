package arrays.fundamentals;

import java.util.Scanner;

public class LinearSearch {
    private class Solution {
        public int linearSearch(int[] nums, int target) {
            int n = nums.length;

            for(int i = 0; i < n; i++) {
                if(nums[i] == target) return i;
            }

            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        Solution sol = new LinearSearch().new Solution();
        System.out.println(sol.linearSearch(nums, target));

        scanner.close();
    }
}
