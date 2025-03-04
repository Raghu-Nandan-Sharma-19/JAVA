package arrays.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2 {
    private static class Solution {
        public List<Integer> majorityElementTwo(int[] nums) {
            int n = nums.length;
            int cnt1 = 0, cnt2 = 0;
            int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

            // First pass: Find potential candidates for majority elements
            for (int i = 0; i < n; i++) {
                if (cnt1 == 0 && nums[i] != element2) {
                    cnt1 = 1;
                    element1 = nums[i];
                } else if (cnt2 == 0 && nums[i] != element1) {
                    cnt2 = 1;
                    element2 = nums[i];
                } else if (element1 == nums[i]) {
                    cnt1++;
                } else if (element2 == nums[i]) {
                    cnt2++;
                } else {
                    cnt1--;
                    cnt2--;
                }
            }

            List<Integer> result = new ArrayList<>();  
            cnt1 = 0;
            cnt2 = 0;

            // Second pass: Verify the candidates
            for (int i = 0; i < n; i++) {
                if (element1 == nums[i]) {
                    cnt1++;
                }

                if (element2 == nums[i]) {
                    cnt2++;
                }
            }

            // Check if the candidates appear more than n/3 times
            if (cnt1 > (n / 3)) {
                result.add(element1);
            }

            if (cnt2 > (n / 3)) {
                result.add(element2);
            }

            // return result
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Read input array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        System.out.println(solution.majorityElementTwo(nums));

        scanner.close();
    }
}
