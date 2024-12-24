package basicRecursion.problems;

import java.util.Scanner;

public class CheckIfAStringIsPalindromeOrNot {
    private class Solution {
        private boolean isPalindrome(String s, int left, int right) {
            if(left >= right) {
                return true;
            }
            
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            return isPalindrome(s, left+1, right-1);
        }

        public boolean palindromeCheck(String s) {
            s = s.toLowerCase().replaceAll("^a-zA-Z0-9", "");
            int n = s.length();
            int left = 0, right = n-1;
            return isPalindrome(s, left, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Solution sol;
        sol = new CheckIfAStringIsPalindromeOrNot().new Solution();
        System.out.println(sol.palindromeCheck(s));
        scanner.close();
    }
}
