package step1;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greet();

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Average is : " + average(num1, num2));

        sc.close();
    }

    static void greet() {
        System.out.println("Namaste user!");
    }

    public static int average(int num1, int num2) {
        return (num1 + num2) / 2;
    }
}
