package basicMaths;

import java.util.Scanner;

class ReverseNumber {
    public int reverseNumber(int num) {
        int reversedNumber = 0;

        while(num > 0) {
            int currentDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
            num /= 10;
        }

        return reversedNumber;
    }
}

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverseNumber(num));
        scanner.close();
    }
}
