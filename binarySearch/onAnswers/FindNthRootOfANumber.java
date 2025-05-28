package binarySearch.onAnswers;

import java.util.Scanner;

public class FindNthRootOfANumber {
    private static int nthRoot(int N, int M) {
        for (int i = 1; i <= M; i++) {
            long val = (long) (Math.pow(i, N));

            if (val == M) {
                return i;
            } else if (val > M) {
                break;
            }
        }

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
