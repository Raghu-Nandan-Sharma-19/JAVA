package arrays.faqHard;

import java.util.Scanner;

public class MajorityElement1 {
    private static class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            
            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }

                if (count > (n / 2)) {
                    return nums[i];
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
