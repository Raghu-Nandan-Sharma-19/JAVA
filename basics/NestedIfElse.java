package basics;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            // num1 or num3 is greatest
            if (num1 > num3) {
                System.out.println(num1 + " is greatest");
            } else if (num3 > num1) {
                System.out.println(num3 + " is greatest");
            }
        } else {
            // num2 is greatest
            System.out.println(num2 + " is greatest");
        }

        scanner.close();
    }
}
