package patterns;

import java.util.Scanner;

class PrintPattern13 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        int start = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
}

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern13 printPattern13 = new PrintPattern13();
        printPattern13.print(scanner);
        scanner.close();
    }
}
