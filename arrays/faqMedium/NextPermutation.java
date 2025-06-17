package arrays.faqMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextPermutation {
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    private static boolean match(int[] nums, List<Integer> list) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != list.get(i)) return false;
        }
        return true;
    }

    private static void helperFunction(int ind, int[] nums, List<List<Integer>> ans) {
        if (ind == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            ans.add(temp);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            swap(nums, ind, i);
            helperFunction(ind + 1, nums, ans);
            swap(nums, ind, i);
        }

        return;
    }

    private static List<List<Integer>> getAllPermutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helperFunction(0, nums, ans);
        
        Collections.sort(ans, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }

            return 0;
        });

        return ans;
    }

    private static void nextPermutation(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(getAllPermutations(nums));
        int idx = -1;

        for (int i = 0; i < ans.size(); i++) {
            if (match(nums, ans.get(i))) {
                idx = i;
                break;
            }
        }

        int nextPermutationIndex = -1;

        if (idx == ans.size() - 1) nextPermutationIndex = 0;
        else nextPermutationIndex = idx + 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(nextPermutationIndex).get(i);
        }

        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        nextPermutation(nums);

        for (var num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
