package patterns;

import java.util.Scanner;

class PrintPattern21 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern21 printPattern21 = new PrintPattern21();
        printPattern21.print(scanner);
        scanner.close();
    }
}
