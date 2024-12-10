package patterns;

import java.util.Scanner;

class PrintPattern4 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern4 printPattern4 = new PrintPattern4();
        printPattern4.print(scanner);
        scanner.close();
    }
}
