package basicRecursion.problems;

import java.util.Scanner;

public class CheckIfANumberIsPrimeOrNot {
    private class Solution {
        private boolean isPrime(int num, int x) {
            if(x*x > num) {
                return true;
            }

            if(num%x == 0) {
                return false;
            }

            return isPrime(num, x+1);
        }

        public boolean checkPrime(int num) {
            return isPrime(num, 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution sol = new CheckIfANumberIsPrimeOrNot().new Solution();
        System.out.println(sol.checkPrime(num));
        scanner.close();
    }
}
