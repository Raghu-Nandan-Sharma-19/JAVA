package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInRotatedSortedArray2 {
    private static boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            if (nums.get(i) == k) {
                return true;
            }
        }

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
