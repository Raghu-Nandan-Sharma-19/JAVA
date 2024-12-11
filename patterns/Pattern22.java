package patterns;

import java.util.Scanner;

class PrintPattern22 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 0; i < (2 * n - 1); i++) {
            for(int j = 0; j < (2 * n - 1); j++) {
                int top = i, bottom = j;
                int left = (2 * n - 2) - i, right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern22 printPattern22 = new PrintPattern22();
        printPattern22.print(scanner);
        scanner.close();
    }
}
