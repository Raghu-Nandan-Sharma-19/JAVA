package patterns;

import java.util.Scanner;

class PrintPattern1 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern1 printPattern1 = new PrintPattern1();
        printPattern1.print(scanner);
        scanner.close();
    }
}
