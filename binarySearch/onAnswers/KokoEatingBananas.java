package binarySearch.onAnswers;

import java.util.Scanner;

public class KokoEatingBananas {
    private static int maxElement(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        return maxi;
    }
    
    private static int calculateTotalHours(int[] nums, int n, int hour) {
        int totalHours = 0;

        for (int i = 0; i < n; i++) {
            totalHours += Math.ceil((double) (nums[i]) / (double) (hour));
        }

        return totalHours;
    }

    private static int minimumRateToEatBananas(int[] nums, int h) {
        int n = nums.length;
        int maxi = maxElement(nums, n);

        for (int i = 1; i <= maxi; i++) {
            long reqTime = calculateTotalHours(nums, n, i);

            if (reqTime <= h) {
                return i;
            }
        }

        return maxi;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int h = scanner.nextInt();

        System.out.println(minimumRateToEatBananas(nums, h));

        scanner.close();
    }
}
