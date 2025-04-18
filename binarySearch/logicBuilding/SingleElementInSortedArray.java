package binarySearch.logicBuilding;

import java.util.Scanner;

public class SingleElementInSortedArray {
    private static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans ^= nums[i];
        }

        return ans;
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
