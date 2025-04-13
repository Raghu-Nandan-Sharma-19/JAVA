package binarySearch.logicBuilding;

import java.util.Scanner;

public class FirstAndLastOccurence {
    private static int lowerBound(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    
    private static int upperBound(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, n, target);
        int ub = upperBound(nums, n, target);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, (ub - 1)};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        for (int num : searchRange(nums, target)) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
