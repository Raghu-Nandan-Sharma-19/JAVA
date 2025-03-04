package arrays.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2 {
    private static class Solution {
        public List<Integer> majorityElementTwo(int[] nums) {
            int n = nums.length;
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (result.size() == 0 || result.get(0) != nums[i]) {
                    int count = 0;
                    for (int j = 0; j < n; j++) {
                        if (nums[j] == nums[i]) {
                            count++;
                        }
                    }

                    if (count > (n / 3)) {
                        result.add(nums[i]);
                    }
                }

                if (result.size() == 2) {
                    break;
                }
            }

            return result;
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
        System.out.println(solution.majorityElementTwo(nums));

        scanner.close();
    }
}
