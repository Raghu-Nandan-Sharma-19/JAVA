package basicRecursion.problems;

import java.util.Scanner;

public class FibonacciNumber {
    private class Solution {
        public int fibonacci(int num) {
            if(num == 0) return 0;
            if(num == 1) return 1;
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution sol = new FibonacciNumber().new Solution();
        System.out.println(sol.fibonacci(num));
        scanner.close();
    }
}
