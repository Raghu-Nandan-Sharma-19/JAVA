package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    private static class Solution {
        public int[] unionArray(int[] nums1, int[] nums2) {
            // Array list to store union temporarily
            List<Integer> unionList = new ArrayList<>();
            int n1 = nums1.length;
            int n2 = nums2.length;
            // i and j pointers to traverse the arrays
            int i = 0;
            int j = 0;

            /* iterating till i is less than size of 1st array and 
             * j is less than size of 2nd array
             */
            while (i < n1 && j < n2) {
                /* if element of array 1 is less than equal to element 
                 * of array 2
                */
                if (nums1[i] <= nums2[j]) {
                    /* if union list is empty or the last element is not 
                     * equal to current element of array 1 add element from
                     * array 1 to union list
                     */
                    if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                        unionList.add(nums1[i]);
                    }
                    // increment the i pointer by one
                    i++;
                } else {
                    /* if union list is empty or the last element is not 
                     * equal to current element of array 2 add element from
                     * array 2 to union list
                     */
                    if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                        unionList.add(nums2[j]);
                    }
                    // increment the j pointer by one
                    j++;
                }
            }
            
            // if elements in array 1 are left
            while (i < n1) {
                /* if union list is empty or the last element is not 
                 * equal to current element of array 1 add element from
                 * array 1 to union list
                 */
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }
                // increment the i pointer by one
                i++;
            }

            // if elements in array 2 are left
            while (j < n2) {
                /* if union list is empty or the last element is not 
                 * equal to current element of array 1 add element from
                 * array 1 to union list
                 */
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                    unionList.add(nums2[j]);
                }
                // increment the j pointer by one
                j++;
            }

            // declaring a union array
            int[] union = new int[unionList.size()];
            // adding elements from unionlist to union array
            for (int k = 0; k < unionList.size(); k++) {
                union[k] = unionList.get(k);
            }

            // returning the union array
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
