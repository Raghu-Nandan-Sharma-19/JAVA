package patterns;

import java.util.Scanner;

class PrintPattern14 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <='A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern14 printPattern14 = new PrintPattern14();
        printPattern14.print(scanner);
        scanner.close();
    }
}
