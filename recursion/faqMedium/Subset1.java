package recursion.faqMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Subset1 {
    private static void solve(int idx, int sum, int[] nums, List<Integer> ans) {
        // Base case: If we've processed all elements
        if (idx == nums.length) {
            // Add the current sum to our answer list
            ans.add(sum);
            return;
        }

        // Include the current element in the subset
        solve(idx + 1, sum + nums[idx], nums, ans);
        
        // Exclude the current element from the subset
        solve(idx + 1, sum, nums, ans);
    }

    private static List<Integer> subsetSums(int[] nums) {
        // Initialize an ArrayList to store all possible subset sums
        List<Integer> ans = new ArrayList<>();

        // Start the recursive process with initial index 0 and sum 0
        solve(0, 0, nums, ans);

        // Return the list containing all subset sums
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        List<Integer> ans = subsetSums(nums);
        Collections.sort(ans);

        System.out.println(ans);

        scanner.close();
    }
}
