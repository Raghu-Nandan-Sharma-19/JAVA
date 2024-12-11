package patterns;

import java.util.Scanner;

class PrintPattern17 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // character
            char ch = 'A';
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if(j < i) ch++;
                else ch--;
            }
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern17 printPattern17 = new PrintPattern17();
        printPattern17.print(scanner);
        scanner.close();
    }
}
