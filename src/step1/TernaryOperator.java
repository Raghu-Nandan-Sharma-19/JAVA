package step1;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int max = 0;

        max = a > b ? a : b;

        System.out.println("Value of max is : " + max);

        sc.close();
    }
}
