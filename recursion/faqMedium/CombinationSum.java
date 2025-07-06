package recursion.faqMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    private static void func(List<Integer> v, int i, int sum, List<Integer> v2, List<List<Integer>> ans) {
        // Base case: If sum becomes 0, we found a valid combination
        if (sum == 0) {
            ans.add(new ArrayList<>(v2)); // Add a deep copy of current combination to answer
            return;
        }

        // Base case: If sum becomes negative or we've checked all candidates, return
        if (sum < 0 || i == v.size()) {
            return;
        }

        // Include current element
        v2.add(v.get(i));
        
        // Recursive call with same index (since we can reuse the same element) and reduced sum
        func(v, i, sum - v.get(i), v2, ans);

        // Backtrack: Remove the current element to try other combinations
        v2.remove(v2.size() - 1);

        // Recursive call without using current element (move to next element)
        func(v, i + 1, sum, v2, ans);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Create a list to store candidates for easier handling
        List<Integer> v = new ArrayList<>();
        // Initialize the answer list to store all valid combinations
        List<List<Integer>> ans = new ArrayList<>();

        // Convert the candidates array to an ArrayList
        for (int candidate : candidates) {
            v.add(candidate);
        }

        // Call the recursive helper function
        // Parameters: candidate list, starting index (0), target sum, current 
        // combination (empty), result list
        func(v, 0, target, new ArrayList<>(), ans);

        // Return all valid combinations that sum to the target
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

        System.out.println(combinationSum(candidates, target));

        scanner.close();
    }
}
