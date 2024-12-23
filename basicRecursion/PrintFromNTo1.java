package basicRecursion;

import java.util.Scanner;

class PrintNTo1 {
    public void print(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}

public class PrintFromNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PrintNTo1 printNTo1 = new PrintNTo1();
        printNTo1.print(n);
        scanner.close();
    }
}
