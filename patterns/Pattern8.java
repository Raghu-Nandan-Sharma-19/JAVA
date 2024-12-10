package patterns;

import java.util.Scanner;

class PrintPattern8 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
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
}

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern8 printPattern8 = new PrintPattern8();
        printPattern8.print(scanner);
        scanner.close();
    }
}
