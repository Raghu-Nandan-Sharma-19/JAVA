package arrays.faqMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    private static class Solution {
        // Method to find all unique triplets in the array which gives the sum of zero
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            // Sort the array to make it easier to avoid duplicates and use two pointers
            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {
                // Skip the same element to avoid duplicate triplets
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                
                int j = i + 1;
                int k = n - 1;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum < 0) {
                        j++; // Move the left pointer to the right to increase the sum
                    } else if (sum > 0) {
                        k--; // Move the right pointer to the left to decrease the sum
                    } else {
                        // Found a triplet with zero sum
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ans.add(temp);
                        j++;
                        k--;

                        // Skip the same elements to avoid duplicate triplets
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }

                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }   
                }
            }

            // returning the triplets
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

        Solution solution = new Solution();
        for (List<Integer> row : solution.threeSum(nums)) {
            for (Integer col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}