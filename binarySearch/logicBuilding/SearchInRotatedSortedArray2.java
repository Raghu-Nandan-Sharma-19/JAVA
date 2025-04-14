package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInRotatedSortedArray2 {
    private static boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        int n = nums.size();

        // search space for binary search
        int low = 0;
        int high = n - 1;

        // looping till low <= high
        while (low <= high) {
            // calculate the middle index to avoid overflow case
            int mid = low + (high - low) / 2;

            // if mid element is equal to k return true
            if (nums.get(mid).equals(k)) {
                return true;
            }

            // if element at low, mid and high index are same, trim the search space
            if (nums.get(low).equals(nums.get(mid)) && nums.get(mid).equals(nums.get(high))) {
                low++;
                high--;
                continue;
            }

            // check if left half is sorted
            if (nums.get(low) <= nums.get(mid)) {
                // check if the target lies in the left sorted half
                if (nums.get(low) <= k && k <= nums.get(mid)) {
                    high = mid - 1; // search in left half
                } else { 
                    low = mid + 1; // search in right half
                }
            } else { // right half is sorted
                // check if the target lies in the right sorted half
                if (nums.get(mid) <= k && k <= nums.get(high)) {
                    low = mid + 1; // search in right half
                } else {
                    high = mid - 1; // search in left half
                }
            }
        }
        
        // return false if element is not found
        return false;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        int k = scanner.nextInt();

        System.out.println(searchInARotatedSortedArrayII(nums, k));

        scanner.close();
    }
}
