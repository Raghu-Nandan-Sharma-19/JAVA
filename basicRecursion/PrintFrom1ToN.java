package basicRecursion;

import java.util.Scanner;

class Print1ToN {
    public void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
}

public class PrintFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Print1ToN print1ToN = new Print1ToN();
        print1ToN.print(n);
        scanner.close();
    }
}
