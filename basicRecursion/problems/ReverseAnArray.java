package basicRecursion.problems;

import java.util.Scanner;

public class ReverseAnArray {
    private class Solution {
        public void swap(int[] nums, int left, int right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        public void reverse(int[] nums, int left, int right) {
            if(left > right) {
                return;
            }
            swap(nums, left, right);
            reverse(nums, left+1, right-1);
        }

        public int[] reverseArray(int[] nums) {
            int n = nums.length;
            reverse(nums, 0, n-1);
            return nums;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new ReverseAnArray().new Solution();
        int[] ans = sol.reverseArray(nums);

        for(int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
