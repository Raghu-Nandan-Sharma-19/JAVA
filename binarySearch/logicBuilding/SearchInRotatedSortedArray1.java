package binarySearch.logicBuilding;

import java.util.Scanner;

public class SearchInRotatedSortedArray1 {
    private static int search(int[] nums, int k) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(search(nums, k));

        scanner.close();
    }
}
