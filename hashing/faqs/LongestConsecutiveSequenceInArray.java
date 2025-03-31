package hashing.faqs;

import java.util.Scanner;

public class LongestConsecutiveSequenceInArray {
    // linear search method to find the next greater element
    private static boolean linearSearch(int[] nums, int x) {
        for (int num : nums) {
            if (num == x) {
                return true;
            }
        }

        return false;
    }
    
    // method to find longest consecutive sequence in array
    private static int longestConsecutive(int[] nums) {
        // size of the array
        int n = nums.length;
        // taking longest as 0
        int longest = 0;

        // iterating through the array
        for (int i = 0; i < n; i++) {
            // taking the first consecutive element
            int x = nums[i];
            // assigning cnt as 1 for 1st consecutive element
            int cnt = 1;

            // linear search to find next consecutive element 
            while (linearSearch(nums, x + 1)) {
                // increasing x and cnt by 1
                x++;
                cnt++;
            }
            
            // updating longest with the max of cnt and longest
            longest = Math.max(cnt, longest);
        }

        // returning the longest consecutive sequence
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(longestConsecutive(nums));

        scanner.close();
    }
}
