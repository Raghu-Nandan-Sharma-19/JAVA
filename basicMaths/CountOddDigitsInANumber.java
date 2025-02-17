package basicMaths;

import java.util.Scanner;

class CountOddDigits {
    public int countOdd(int num) {
        if (num == 0) return 0;
        int cntOddDigits = 0;
        
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit % 2 == 1) {
                cntOddDigits++;
            }
            num /= 10;
        }

        return cntOddDigits;
    }
}

public class CountOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CountOddDigits countOddDigits = new CountOddDigits();
        System.out.println(countOddDigits.countOdd(num));
        scanner.close();
    }
}
