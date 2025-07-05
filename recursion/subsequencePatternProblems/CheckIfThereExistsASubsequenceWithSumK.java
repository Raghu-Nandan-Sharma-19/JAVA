package recursion.subsequencePatternProblems;

import java.util.Scanner;

public class CheckIfThereExistsASubsequenceWithSumK {
    private static boolean solve(int i, int n, int[] nums, int k) {
        // Base case: If the target sum k is 0, we have found a valid subsequence.
        if (k == 0) {
            return true;
        }

        // If k becomes negative, this path is not a solution.
        // This can happen if we take an element larger than the remaining k.
        if (k < 0) {
            return false;
        }

        // Base case: If we have considered all elements.
        if (i == n) {
            // We can only have a solution if the target sum has become 0.
            return k == 0;
        }

        /* Recursive step:
            Try including the current element nums[i] in the subsequence.
            Then, check if a subsequence with sum (k - nums[i]) exists in the 
            rest of the array.
            OR
            Try not including the current element nums[i] in the subsequence.
            Then, check if a subsequence with sum k exists in the rest of the array.
            If either of these possibilities returns true, then a solution exists. */
        return solve(i + 1, n, nums, k - nums[i]) || solve(i + 1, n, nums, k);
    }
    
    private static boolean checkSubsequenceSum(int[] nums, int k) {
        // Call the recursive helper function to check for the subsequence sum.
        // Start checking from the 0th index.
        return solve(0, nums.length, nums, k);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        
        if (checkSubsequenceSum(nums, k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
