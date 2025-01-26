package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    private static class Solution {
        public int[] unionArray(int[] nums1, int[] nums2) {
            List<Integer> unionList = new ArrayList<>();
            int n1 = nums1.length;
            int n2 = nums2.length;
            int i = 0;
            int j = 0;

            while (i < n1 && j < n2) {
                if (nums1[i] <= nums2[j]) {
                    if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                        unionList.add(nums1[i]);
                    }
                    i++;
                } else {
                    if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                        unionList.add(nums2[j]);
                    }
                    j++;
                }
            }
            
            while (i < n1) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }
                i++;
            }

            while (j < n2) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                    unionList.add(nums2[j]);
                }
                j++;
            }

            int[] union = new int[unionList.size()];
            for (int k = 0; k < unionList.size(); k++) {
                union[k] = unionList.get(k);
            }

            return union;
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
        int[] ans = solution.unionArray(nums1, nums2);
        for (int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
