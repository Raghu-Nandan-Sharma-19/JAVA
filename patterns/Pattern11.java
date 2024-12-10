package patterns;

import java.util.Scanner;

class PrintPattern11 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            int start = 1;
            if(i % 2 == 0) start = 0;
            for(int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern11 printPattern11 = new PrintPattern11();
        printPattern11.print(scanner);
        scanner.close();
    }
}
