package patterns;

import java.util.Scanner;

class PrintPattern9 {
    private void printUpperHalf(int n) {
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printLowerHalf(int n) {
        for(int i = 0; i < n; i++) {
            // space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
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

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern9 printPattern9 = new PrintPattern9();
        printPattern9.print(scanner);
        scanner.close();
    }
}
