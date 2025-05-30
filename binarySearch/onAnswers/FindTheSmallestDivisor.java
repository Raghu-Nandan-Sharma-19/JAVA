package binarySearch.onAnswers;

import java.util.Scanner;

public class FindTheSmallestDivisor {
    private static int maxElement(int[] nums, int n) {
        int maxi = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > maxi) {
                maxi = nums[i];
            }
        }

        return maxi;
    }

    private static int sumByDivisor(int[] nums, int divisor, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (nums[i]) / (double) (divisor));
        }

        return sum;
    }

    private static int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        int maxi = maxElement(nums, n);

        for (int divisor = 1; divisor <= maxi; divisor++) {
            if (sumByDivisor(nums, divisor, n) <= limit) {
                return divisor;
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

        int limit = scanner.nextInt();

        System.out.println(smallestDivisor(nums, limit));

        scanner.close();
    }
}
