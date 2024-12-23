package basicRecursion;

import java.util.Scanner;

class PrintN {
    public void print(int x, int n) {
        if(n == 0) {
            return;
        }
        System.out.println(x);
        print(x, n-1);
    }
}

public class PrintXNTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        PrintN printN = new PrintN();
        printN.print(x, n);
        scanner.close();
    }
}
