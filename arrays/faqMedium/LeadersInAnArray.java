package arrays.faqMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInAnArray {
    private static class Solution {
        public ArrayList<Integer> leaders(int[] nums) {
            // size of the array
            int n = nums.length;
            // leaders list to store leaders
            ArrayList<Integer> leaders = new ArrayList<>();
            // maximum value as minimum integer value
            int max = Integer.MIN_VALUE;

            // iterating from n - 1 to 0
            for (int i = n - 1; i >= 0; i--) {
                // if current element is greater than maximum
                if (nums[i] > max) {
                    // adding to the leaders list
                    leaders.add(nums[i]);
                    // updating the maximum value
                    max = nums[i];
                }
            }
            
            // reversing the list in order to return in order they appear in array
            Collections.reverse(leaders);

            // returning the leaders list
            return leaders;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        ArrayList<Integer> ans = sol.leaders(nums);
        for (int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
