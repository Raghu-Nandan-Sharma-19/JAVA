package basicRecursion.problems;

import java.util.Scanner;

public class SumOfDigitsInAGivenNumber {
    private class Solution {
        public int sumOfDigits(int num) {
            if(num < 10) {
                return num;
            }

            int sum = 0;
            while(num > 0) {
                sum += num%10;
                num /= 10;
            }

            return sumOfDigits(sum);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution sol;
        sol = new SumOfDigitsInAGivenNumber().new Solution();
        System.out.println(sol.sumOfDigits(num));
        scanner.close();
    }
}
