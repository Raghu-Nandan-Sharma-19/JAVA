package arrays.faqHard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement1 {
    private static class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            HashMap<Integer, Integer> mpp = new HashMap<>();

            for (int num : nums) {
                mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
                if (it.getValue() > (n / 2)) {
                    return it.getKey();
                }
            }

            return -1;
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
        System.out.println(solution.majorityElement(nums));
        
        scanner.close();
    }
}
