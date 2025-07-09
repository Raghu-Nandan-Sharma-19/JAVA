package recursion.faqMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum3 {
    private static void solve(int sum, int last, List<Integer> nums, int k, List<List<Integer>> ans) {
        // If the sum is 0 and we have exactly k numbers, add the current combination to the answer
        if (sum == 0 && nums.size() == k) {
            ans.add(new ArrayList<>(nums));
            return;
        }

        // If sum becomes negative or we have more than k numbers, stop exploring this path
        if (sum <= 0 || nums.size() > k) return;

        // Try all numbers from 'last' to 9
        for (int i = last; i <= 9; i++) {
            // Only proceed if the current number does not exceed the remaining sum
            if (i <= sum) {
                nums.add(i); // Choose the current number
                solve(sum - i, i + 1, nums, k, ans); // Recurse with updated sum and next number
                nums.remove(nums.size() - 1); // Backtrack: remove the last chosen number
            } else {
                break; // No need to check further as numbers are increasing
            }
        }
    }
    
    private static List<List<Integer>> combinationSum3(int k, int n) {
        // List to store the current combination
        List<Integer> nums = new ArrayList<>();
        // List to store all valid combinations
        List<List<Integer>> ans = new ArrayList<>();

        // Start the recursive backtracking from 1 to 9
        solve(n, 1, nums, k, ans);

        // Return the list of all valid combinations
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(combinationSum3(k, n));
        
        scanner.close();
    }
}
