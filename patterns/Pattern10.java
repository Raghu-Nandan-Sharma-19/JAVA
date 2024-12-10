package patterns;

import java.util.Scanner;

class PrintPattern10 {
    private void printUpperHalf(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printLowerHalf(int n) {
        for(int i  = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        printUpperHalf(n);
        printLowerHalf(n - 1);
    }
}

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern10 printPattern10 = new PrintPattern10();
        printPattern10.print(scanner);
        scanner.close();
    }
}
