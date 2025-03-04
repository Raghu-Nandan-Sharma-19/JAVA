package arrays.contest;

import java.util.*;

public class SetDifferenceOfTwoArrays {
    private static class Solution {
        public int[] setDifference(int[] nums1, int[] nums2) {
            List<Integer> result = new ArrayList<>();
            int i = 0, j = 0;
            int n1 = nums1.length, n2 = nums2.length;

            while (i < n1 && j < n2) {
                if (nums1[i] < nums2[j]) {
                    if (result.isEmpty() || !result.get(result.size() - 1).equals(nums1[i])) {
                        result.add(nums1[i]);
                    }
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    if (result.isEmpty() || !result.get(result.size() - 1).equals(nums2[j])) {
                        result.add(nums2[j]);
                    }
                    j++;
                } else {
                    int current = nums1[i];
                    while (i < n1 && nums1[i] == current) i++;
                    while (j < n2 && nums2[j] == current) j++;
                }
            }

            while (i < n1) {
                if (result.isEmpty() || !result.get(result.size() - 1).equals(nums1[i])) {
                    result.add(nums1[i]);
                }
                i++;
            }

            while (j < n2) {
                if (result.isEmpty() || !result.get(result.size() - 1).equals(nums2[j])) {
                    result.add(nums2[j]);
                }
                j++;
            }

            int[] resultArr = new int[result.size()];
            for (int k = 0; k < result.size(); k++) {
                resultArr[k] = result.get(k);
            }

            return resultArr;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        int[] result = solution.setDifference(nums1, nums2);

        System.out.println(Arrays.toString(result));
        
        scanner.close();
    }
}
