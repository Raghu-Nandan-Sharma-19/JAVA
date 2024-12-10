package patterns;

import java.util.Scanner;

class PrintPattern6 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern6 printPattern6 = new PrintPattern6();
        printPattern6.print(scanner);
        scanner.close();
    }
}
