package patterns;

import java.util.Scanner;

class PrintPattern19 {
    private void printUpperHalf(int n) {
        for(int i = 0; i < n; i++) {
            // stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for(int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printLowerHalf(int n) {
        for(int i = 0; i < n; i++) {
            // stars
            for(int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            // space
            for(int j = 1; j <= (2 * n - 2) - (2 * i); j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= i + 1; j++) {
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

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern19 printPattern19 = new PrintPattern19();
        printPattern19.print(scanner);
        scanner.close();
    }
}
