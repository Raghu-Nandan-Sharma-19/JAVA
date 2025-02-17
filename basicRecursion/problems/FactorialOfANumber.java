package basicRecursion.problems;

import java.util.Scanner;

public class FactorialOfANumber {
    private class Solution {
        public int factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution sol = new FactorialOfANumber().new Solution();
        System.out.println(sol.factorial(n));
        scanner.close();
    }
}
