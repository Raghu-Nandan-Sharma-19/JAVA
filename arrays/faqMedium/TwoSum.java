package arrays.faqMedium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    private static class Solution {
        public int[] twoSum(int[] nums, int target) {
            // HashMap to store the number and its index
            HashMap<Integer, Integer> mpp = new HashMap<>();
            // Length of the array
            int n = nums.length;


            // iterate through the array
            for (int i = 0; i < n; i++) {
                // current number
                int num = nums[i];
                // number needed to reach the target
                int moreNeeded = target - num;
                
                // if the number needed is present in the map
                if (mpp.containsKey(moreNeeded)) {
                    // return the indices of the numbers
                    return new int[]{mpp.get(moreNeeded), i};
                }
                
                // store the number and its index
                mpp.put(num, i);
            }

            // if no such pair is found
            return new int[]{-1, -1};
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
        for (int num : solution.twoSum(nums, target)) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
