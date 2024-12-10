package patterns;

import java.util.Scanner;

class PrintPattern3 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern3 printPattern3 = new PrintPattern3();
        printPattern3.print(scanner);
        scanner.close();
    }
}
