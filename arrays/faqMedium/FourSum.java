package arrays.faqMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    private static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>(); // List to store the result
            int n = nums.length;
            Arrays.sort(nums); // Sort the array to make it easier to avoid duplicates

            for (int i = 0; i < n; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue; // Skip duplicate elements
                }

                for (int j = i + 1; j < n; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue; // Skip duplicate elements
                    }

                    int k = j + 1;
                    int l = n - 1;

                    while (k < l) {
                        long sum = nums[i];
                        sum += nums[j];
                        sum += nums[k];
                        sum += nums[l];

                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            ans.add(temp);
                            k++;
                            l--;

                            if (k < l && nums[k] == nums[k - 1]) {
                                k++;
                            }

                            if (k < l && nums[l] == nums[l + 1]) {
                                l--;
                            }
                        } else if (sum < target) {
                            k++;
                        } else {
                            l--;
                        }
                    }
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.fourSum(nums, target));

        scanner.close();
    }
}
