package basicMaths;

import java.util.Scanner;

class LargestDigit {
    public int largestDigitInNumber(int num) {
        int largestDigit = Integer.MIN_VALUE;

        while(num > 0) {
            int currentDigit = num % 10;
            if(currentDigit > largestDigit) {
                largestDigit = currentDigit;
            }
            num /= 10;
        }

        return largestDigit;
    }
}

public class LargestDigitInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        LargestDigit largestDigit = new LargestDigit();
        System.out.println(largestDigit.largestDigitInNumber(num));
        scanner.close();
    }
}
