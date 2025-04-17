package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOutHowManyTimesArrayIsRotated {
    private static int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();

        // search space of binary search
        int low = 0;
        int high = n - 1;

        // minimum element in array
        int minimum = Integer.MAX_VALUE;

        // index to store how many times array is rotated
        int rotatedIndex = -1;
        
        // applying binary search
        while (low <= high) {
            // mid element in array
            int mid = low + (high - low) / 2;

            /* if element at low index is less than equal to element at high index then the search
             * space is already sorted 
             */
            if (nums.get(low) <= nums.get(high)) {
                // check if element at low index is less than minimum element 
                if (nums.get(low) < minimum) {
                    // update minimum with element at low index
                    minimum = nums.get(low);
                    
                    // update the rotated index with low index
                    rotatedIndex = low;
                }

                // break the loop
                break;
            }

            // check if the array is left sorted
            if (nums.get(low) <= nums.get(mid)) {
                // if element at low index is less than minimum element
                if (nums.get(low) < minimum) {
                    // update minimum with element at low index
                    minimum = nums.get(low);

                    // update the rotated index with low index
                    rotatedIndex = low;
                }

                // move the search space to right half
                low = mid + 1;
            } else { // right half must be sorted
                // if element at mid index is less than element at minimum element
                if (nums.get(mid) < minimum) {
                    // update minimum with element at mid index
                    minimum = nums.get(mid);

                    // update the rotated index with mid index
                    rotatedIndex = mid;
                }

                // move the search space to left half
                high = mid - 1;
            }
        }

        // return the rotated index which will contain how many times array is rotated
        return rotatedIndex;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }
        
        System.out.println(findKRotation(nums));

        scanner.close();
    }
}
