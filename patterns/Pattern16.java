package patterns;

import java.util.Scanner;

class PrintPattern16 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        char ch = 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern16 printPattern16 = new PrintPattern16();
        printPattern16.print(scanner);
        scanner.close();
    }
}
