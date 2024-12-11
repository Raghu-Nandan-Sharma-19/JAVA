package patterns;

import java.util.Scanner;

class PrintPattern12 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++) {
            // numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for(int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }
            // numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern12 printPattern12 = new PrintPattern12();
        printPattern12.print(scanner);
        scanner.close();
    }
}
