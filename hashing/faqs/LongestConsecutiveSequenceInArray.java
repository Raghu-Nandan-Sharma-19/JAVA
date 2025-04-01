package hashing.faqs;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequenceInArray {
    // method to find longest consecutive sequence in array
    private static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int cnt = 0;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(longestConsecutive(nums));

        scanner.close();
    }
}
