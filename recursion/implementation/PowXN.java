package recursion.implementation;

import java.util.Scanner;

public class PowXN {
    private static double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }

        double ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= x;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        
        System.out.println(myPow(x, n));

        scanner.close();
    }
}
