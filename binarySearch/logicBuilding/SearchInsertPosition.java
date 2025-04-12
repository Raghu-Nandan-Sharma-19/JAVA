package binarySearch.logicBuilding;

import java.util.Scanner;

public class SearchInsertPosition {
    private static int searchInsert(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(searchInsert(nums, target));

        scanner.close();
    }
}
