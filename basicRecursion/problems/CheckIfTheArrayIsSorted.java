package basicRecursion.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfTheArrayIsSorted {
    private class Solution {
        private boolean sort(ArrayList<Integer> nums, int left) {
            int n = nums.size();
            if (left >= n-1) return true;
            if (nums.get(left) > nums.get(left + 1)) return false;
            return sort(nums, left + 1);
        }

        public boolean isSorted(ArrayList<Integer> nums) {
            if (nums.size() <= 1) return true;
            return sort(nums, 0);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            nums.add(element);
        }
        Solution sol = new CheckIfTheArrayIsSorted().new Solution();
        System.out.println(sol.isSorted(nums));
        scanner.close();
    }
}
