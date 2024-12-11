package patterns;

import java.util.Scanner;

class PrintPattern20 {
    private void printUpperHalf(int n) {
        for(int i = 0; i < n; i++) {
            // stars
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for(int j = 1; j <= (2 * n - 2) - (2 * i); j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printLowerHalf(int n) {
        for(int i = 1; i < n; i++) {
            // stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for(int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        printUpperHalf(n);
        printLowerHalf(n);
    }
}

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern20 printPattern20 = new PrintPattern20();
        printPattern20.print(scanner);
        scanner.close();
    }
}
