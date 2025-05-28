package binarySearch.onAnswers;

import java.util.Scanner;

public class FindSquareRootOfANumber {
    private static long floorSqrt(long n) {
        long ans = 1;
        
        for (long i = 2; i <= n; i++) {
            long val = i * i;

            if (val <= n) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        System.out.println(floorSqrt(n));

        scanner.close();
    }
}