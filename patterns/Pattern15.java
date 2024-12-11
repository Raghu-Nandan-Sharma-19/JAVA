package patterns;

import java.util.Scanner;

class PrintPattern15 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern15 printPattern15 = new PrintPattern15();
        printPattern15.print(scanner);
        scanner.close();
    }
}
