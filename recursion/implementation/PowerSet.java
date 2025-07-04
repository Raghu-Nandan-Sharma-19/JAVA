package recursion.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
    private static void backtrack(int idx, int n, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        // Base case: If we have considered all elements, add the current 
        // subset to the answer.
        if (idx == n) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Decision to not include the current element nums[idx] in the subset.
        backtrack(idx + 1, n, nums, current, ans);

        // Decision to include the current element nums[idx] in the subset.
        current.add(nums[idx]);
        backtrack(idx + 1, n, nums, current, ans);

        // Backtrack: Remove the element to explore other subsets.
        current.remove(current.size() - 1);
    }

    private static List<List<Integer>> powerSet(int[] nums) {
        // List to store all the subsets.
        List<List<Integer>> ans = new ArrayList<>();
        // List to store the current subset being built.
        List<Integer> current = new ArrayList<>();
        // Start the backtracking process from the first element.
        backtrack(0, nums.length, nums, current, ans);
        // Return the list of all subsets.
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(powerSet(nums));

        scanner.close();
    }
}
