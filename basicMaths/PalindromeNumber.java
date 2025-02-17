package basicMaths;

import java.util.Scanner;

class PalindromeNumberCheck {
    private int reverseNumber(int num) {
        int reversedNumber = 0;

        while (num > 0) {
            int currentDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
            num /= 10;
        }

        return reversedNumber;
    }

    public boolean isPalindrome(int num) {
        int reversedNumber = reverseNumber(num);
        return (reversedNumber == num);
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PalindromeNumberCheck palindromeNumberCheck = new PalindromeNumberCheck();
        System.out.println(palindromeNumberCheck.isPalindrome(num));
        scanner.close();
    }
}
