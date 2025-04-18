package binarySearch.logicBuilding;

import java.util.Scanner;

public class SingleElementInSortedArray {
    private static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    return nums[0];
                }
            } else if (i == n - 1) {
                if (nums[i - 1] != nums[i]) {
                    return nums[n - 1];
                }
            } else {
                if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
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

        System.out.println(singleNonDuplicate(nums));

        scanner.close();
    }
}
