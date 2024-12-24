package basicRecursion.problems;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    private class Solution {
        public int nNumbersSum(int n) {
            if(n <= 1) return 1;
            return n+nNumbersSum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution sol = new SumOfFirstNNaturalNumbers().new Solution();
        System.out.println(sol.nNumbersSum(n));
        scanner.close();
    }
}
