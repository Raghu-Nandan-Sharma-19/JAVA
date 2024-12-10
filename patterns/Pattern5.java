package patterns;

import java.util.Scanner;

class PrintPattern5 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i  = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern5 pattern5 = new PrintPattern5();
        pattern5.print(scanner);
        scanner.close();
    }
}
