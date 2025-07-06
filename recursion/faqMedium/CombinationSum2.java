package recursion.faqMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum2 {
    private static void solve(int idx, int sum, List<Integer> nums, int[] candidates, List<List<Integer>> ans) {
        // Base case: if sum becomes 0, we've found a valid combination
        if (sum == 0) {
            // Add a copy of the current combination to our answer list
            ans.add(new ArrayList<>(nums));
            return;
        }

        // Base case: if sum is negative or we've reached the end of our candidates array
        if (sum < 0 || idx == candidates.length) {
            return;
        }

        // Include the current element in our combination
        nums.add(candidates[idx]);

        // Recursive call: move to next index and reduce the sum by the current element's value
        solve(idx + 1, sum - candidates[idx], nums, candidates, ans);

        // Backtrack: remove the current element to try other combinations
        nums.remove(nums.size() - 1);

        // Skip duplicates to avoid duplicate combinations
        for (int i = idx + 1; i < candidates.length; i++) {
            if (candidates[i] != candidates[idx]) {
                // Move to the next different element and keep the same sum
                solve(i, sum, nums, candidates, ans);
                break;
            }
        }
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Initialize an empty list to store current combination
        List<Integer> nums = new ArrayList<>();
        // Initialize result list to store all valid combinations
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the candidates array to handle duplicates properly
        Arrays.sort(candidates);

        // Start the recursive process from index 0 with the target sum
        solve(0, target, nums, candidates, ans);

        // Return all valid combinations
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candidates = new int[n];

        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(combinationSum2(candidates, target));

        scanner.close();
    }
}
