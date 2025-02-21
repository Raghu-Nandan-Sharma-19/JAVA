package arrays.faqMedium;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayOfZeroOneAndTwo {
    private static class Solution {
        public void sortZeroOneTwo(int[] nums) {
            Arrays.sort(nums);
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
        solution.sortZeroOneTwo(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        } 
        System.out.println();

        scanner.close();
    }
}
