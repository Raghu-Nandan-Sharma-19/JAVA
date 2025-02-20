package arrays.faqMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FourSum {
    private static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Set<List<Integer>> set = new HashSet<>();
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    Set<Integer> hashSet = new HashSet<>();
                    for (int k = j + 1; k < n; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        int fourth = target - sum;

                        if (hashSet.contains(fourth)) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], fourth);

                            Collections.sort(temp);
                            set.add(temp);
                        }

                        hashSet.add(nums[k]);
                    }
                }
            }
            
            ans.addAll(set);

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
