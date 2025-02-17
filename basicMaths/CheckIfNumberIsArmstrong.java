package basicMaths;

import java.util.Scanner;

class ArmstrongNumber {
    private int countDigits(int num) {
        int cnt = (int)(Math.log10(num) + 1);
        return cnt;
    }

    public boolean isArmstrong(int num) {
        int copyNum = num, sum = 0;
        int countDigits = countDigits(num);

        while (copyNum > 0) {
            int currentDigit = copyNum % 10;
            sum += Math.pow(currentDigit, countDigits);
            copyNum /= 10;
        }

        return (sum == num);
    }
}

public class CheckIfNumberIsArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        System.out.println(armstrongNumber.isArmstrong(num));
        scanner.close();
    }
}
