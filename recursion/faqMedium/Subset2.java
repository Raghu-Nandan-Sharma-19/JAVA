package recursion.faqMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subset2 {
    private static void solve(int idx, List<Integer> arr, int[] nums, List<List<Integer>> ans) {
        // If we've processed all elements, add the current subset to our result
        if (idx == nums.length) {
            // Create a new ArrayList to avoid modifying the original one later
            ans.add(new ArrayList<>(arr));
            return;
        }

        // Include the current element in our subset
        arr.add(nums[idx]);
        // Recurse to the next index, keeping the current element
        solve(idx + 1, arr, nums, ans);

        // Backtrack: remove the current element from our subset
        arr.remove(arr.size() - 1);

        // Skip all duplicate elements
        for (int j = idx + 1; j < nums.length; j++) {
            if (nums[j] != nums[idx]) {
                // Found a different element, recurse from there
                solve(j, arr, nums, ans);
                return;
            }
        }

        // If all remaining elements are duplicates, skip to the end
        solve(nums.length, arr, nums, ans);
    }
    
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        // Initialize an empty array list to store current subset
        List<Integer> arr = new ArrayList<>();
        // Initialize the result list to store all subsets
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the input array to handle duplicates properly
        Arrays.sort(nums);
        // Start recursion with index 0
        solve(0, arr, nums, ans);

        // Return all generated subsets
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(subsetsWithDup(nums));

        scanner.close();
    }
}
