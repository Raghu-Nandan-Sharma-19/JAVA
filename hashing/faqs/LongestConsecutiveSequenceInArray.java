package hashing.faqs;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequenceInArray {
    // method to find longest consecutive sequence in array
    private static int longestConsecutive(int[] nums) {
        int n = nums.length;
        // if length of array is 0 return 0
        if (n == 0) return 0;

        // longest to store longest consecutive sequence
        int longest = 1;
        // hashset to store elements
        HashSet<Integer> hashSet = new HashSet<>();
        
        // adding elements into hashset
        for (int num : nums) {
            hashSet.add(num);
        }

        // iterating through hashset
        for (var it : hashSet) {
            // if hashset doesn't contains element less than current element of hashset
            if (!hashSet.contains(it - 1)) {
                // taking cnt as 1 and x as the current element
                int cnt = 1;
                int x = it;

                // if hashset contains current element + 1
                while (hashSet.contains(x + 1)) {
                    // incrementing x and cnt
                    x++;
                    cnt++;
                }

                // updating longest with max of longest and cnt
                longest = Math.max(longest, cnt);
            }
        }

        // returning longest consecutive sequence
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
