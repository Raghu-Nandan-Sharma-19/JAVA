package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    private static int findMin(ArrayList<Integer> arr) {
        int n = arr.size();

        // search space for binary search
        int low = 0;
        int high = n - 1;

        // ans to store minimum element
        int ans = Integer.MAX_VALUE;

        // performing binary search
        while (low <= high) {
            // mid element
            int mid = low + (high - low) / 2;

            /* if low element is less than high element then the search space is already sorted
             * so we update ans with minimum of ans and low element and break from the loop
             */
            if (arr.get(low) <= arr.get(high)) {
                ans = Math.min(ans, arr.get(low));
                break;
            } 

            // check if the left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                // update the ans with minimum of ans and low element
                ans = Math.min(ans, arr.get(low));

                // move low to mid + 1 to decrease search space
                low = mid + 1;
            } else { // right half is sorted
                // update the ans with minimum of ans and mid element
                ans = Math.min(ans, arr.get(mid));

                // move high to mid - 1 to decrease search space
                high = mid - 1;
            }
        }

        // return ans
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }

        System.out.println(findMin(arr));

        scanner.close();
    }
}
