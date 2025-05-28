package binarySearch.onAnswers;

import java.util.Scanner;

public class FindSquareRootOfANumber {
    private static long floorSqrt(long n) {
        // bianry search search space
        long low = 1;
        long high = n;

        // Perform binary search to find the floor of the square root
        while (low <= high) {
            // Prevents overflow
            long mid = low + (high - low) / 2; 
            long val = mid * mid;

            if (val <= n) {
                // mid*mid is less than or equal to n, so move right to find a larger answer
                low = mid + 1;
            } else {
                // mid*mid is greater than n, so move left
                high = mid - 1;
            }
        }

        // high will be the floor of the square root of n
        return high;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        System.out.println(floorSqrt(n));

        scanner.close();
    }
}