package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
    private static class Solution {
        public int[] intersectionArray(int[] nums1, int[] nums2) {
            // declaring a temporary list to store intersection
            ArrayList<Integer> ansList = new ArrayList<>();
            int n1 = nums1.length;
            int n2 = nums2.length;
            // i and j pointer to iterate the array
            int i = 0;
            int j = 0;

            /* if i is less than size of array 1 and j is less than size of 
             * array 2
             */
            while (i < n1 && j < n2) {
                /* if element in array 1 less than element in array 2 increment
                 * i pointer
                 */
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums2[j] < nums1[i]) { // if element in array 2 is less than element in array 1 increment j pointer
                    j++;
                } else { // else add element from array 1 to list
                    ansList.add(nums1[i]);
                    i++; // increment i pointer
                    j++; // increment j pointer
                }
            }

            // taking a ans array
            int[] ans = new int[ansList.size()];
            // adding elements from temporary list to ans array
            for (int k = 0; k < ansList.size(); k++) {
                ans[k] = ansList.get(k);
            }

            // returning the ans array
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
