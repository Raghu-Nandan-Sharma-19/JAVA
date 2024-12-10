package patterns;

import java.util.Scanner;

class PrintPattern2 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern2 printPattern2 = new PrintPattern2();
        printPattern2.print(scanner);
        scanner.close();
    }
}
