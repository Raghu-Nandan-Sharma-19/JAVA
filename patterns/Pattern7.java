package patterns;

import java.util.Scanner;

class PrintPattern7 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();

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
}

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern7 printPattern7 = new PrintPattern7();
        printPattern7.print(scanner);
        scanner.close();
    }
}
