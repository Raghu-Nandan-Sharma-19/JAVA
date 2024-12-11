package patterns;

import java.util.Scanner;

class PrintPattern18 {
    public void print(Scanner scanner) {
        int n = scanner.nextInt();
        char chr = (char)('A' + n - 1);
        for(int i = 0; i < n; i++) {
            for(char ch = (char)(chr - i); ch <= chr; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintPattern18 printPattern18 = new PrintPattern18();
        printPattern18.print(scanner);
        scanner.close();
    }
}
