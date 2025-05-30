package binarySearch.onAnswers;

import java.util.Scanner;

public class MinimumDaysToMakeMBouquets {
    private static int maxElement(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (var num : nums) {
            maxi = Math.max(num, maxi);
        }

        return maxi;
    }

    private static int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for (var num : nums) {
            mini = Math.min(num, mini);
        }

        return mini;
    }
    
    private static boolean isPossible(int n, int[] nums, int day, int k, int m) {
        int cnt = 0;
        int noOfBouquets = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                cnt++;
            } else {
                noOfBouquets += (cnt / k);
                cnt = 0;
            }
        }

        noOfBouquets += (cnt / k);

        return (noOfBouquets >= m);
    }

    private static int roseGarden(int n, int[] nums, int k, int m) {
        int mini = minElement(nums);
        int maxi = maxElement(nums);

        for (int i = mini; i <= maxi; i++) {
            if (isPossible(n, nums, i, k, m)) {
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
        int m = scanner.nextInt();

        System.out.println(roseGarden(n, nums, k, m));

        scanner.close();
    }
}
