package recursion.subsequencePatternProblems;

import java.util.Scanner;

public class CountAllSubsequenceWithSumK {
    private static int solve(int idx, int sum, int[] nums) {
        // Base case: If the target sum is 0, we have found a valid subsequence.
        if (sum == 0) return 1;

        // Base case: If we have exhausted the array or the sum becomes negative, this path is not valid.
        if (sum < 0 || idx == nums.length) return 0;

        /* Recursive step:
            1. Include the current element nums[idx] in the subsequence.
            2. Exclude the current element nums[idx] from the subsequence.
            The total count is the sum of counts from both possibilities. */
        return (solve(idx + 1, sum - nums[idx], nums) + solve(idx + 1, sum, nums));
    }
    
    private static int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(0, k, nums);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(countSubsequenceWithTargetSum(nums, k));

        scanner.close();
    }
}
