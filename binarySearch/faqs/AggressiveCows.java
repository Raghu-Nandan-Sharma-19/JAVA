package binarySearch.faqs;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    private static boolean canWePlace(int[] nums, int n, int distance, int cows) {
        int countCows = 1;
        int lastCow = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] - lastCow >= distance) {
                countCows++;
                lastCow = nums[i];
            }

            if (countCows >= cows) return true;
        }

        return false;
    }

    private static int aggressiveCows(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        int limit = nums[n - 1] - nums[0];

        int low = 1;
        int high = limit;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(nums, n, mid, k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(aggressiveCows(nums, k));

        scanner.close();
    }
}
