package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
    private static class Solution {
        public int[] intersectionArray(int[] nums1, int[] nums2) {
            ArrayList<Integer> ansList = new ArrayList<>();
            int n1 = nums1.length;
            int n2 = nums2.length;
            int i = 0;
            int j = 0;

            while (i < n1 && j < n2) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums2[j] < nums1[i]) {
                    j++;
                } else {
                    ansList.add(nums1[i]);
                    i++;
                    j++;
                }
            }

            int[] ans = new int[ansList.size()];
            for (int k = 0; k < ansList.size(); k++) {
                ans[k] = ansList.get(k);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int[] ans = solution.intersectionArray(nums1, nums2);
        for (int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
