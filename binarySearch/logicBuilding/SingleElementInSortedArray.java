package binarySearch.logicBuilding;

import java.util.Scanner;

public class SingleElementInSortedArray {
    private static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // if the array is single sized return the element
        if (n == 1) return nums[0];

        /* if first element of array is not equal to second element of array then the first
         * element of the array is the single element, hence return it
         */
        if (nums[0] != nums[1]) return nums[0];

        /* if second last element of array is not equal to last element of array then the last
         * element of the array is the single element, hence return it
         */
        if (nums[n - 2] != nums[n - 1]) return nums[n - 1];

        // reduced search space for binary search
        int low = 1;
        int high = n - 2;

        // applying binary search
        while (low <= high) {
            // middle of the sorted array
            int mid = low + (high - low) / 2;

            /* if element at mid - 1 index is not eqaual to mid element and 
             * mid element is not equal to element at mid + 1 then then element at mid is 
             * single element, hence return element at mid index
             */
            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            /* if mid is odd index and element at mid - 1 index is equal to element at mid index
             * or mid is even index and element at mid index is equal to element at mid + 1 index
             * then we are standing at left half of the array
             */
            if (((mid % 2 == 1) && (nums[mid - 1] == nums[mid])) || ((mid % 2 == 0) && (nums[mid] == nums[mid + 1]))) {
                // eliminate the left half
                low = mid + 1;
            } else { // we are on the right half
                // eliminate the right half
                high = mid - 1;
            }
        }

        /* return -1 this condition will never execute if guareented that there is a single 
         * element in the array
         */
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(singleNonDuplicate(nums));

        scanner.close();
    }
}
