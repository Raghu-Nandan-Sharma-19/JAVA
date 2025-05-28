package binarySearch.onAnswers;

import java.util.Scanner;

public class FindNthRootOfANumber {
    private static int nthRoot(int N, int M) {
        // Initialize the search range
        int low = 1;
        int high = M;

        // Perform binary search to find the Nth root of M
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Calculate mid raised to the power N
            long val = (long) (Math.pow(mid, N));

            // If mid^N equals M, mid is the Nth root
            if (val == M) {
                return mid;
            }

            // If mid^N is less than M, search in the higher half
            if (val < M) {
                low = mid + 1;
            } else {
                // If mid^N is greater than M, search in the lower half
                high = mid - 1;
            }
        }

        // If no integer Nth root exists, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        System.out.println(nthRoot(N, M));

        scanner.close();
    }
}
