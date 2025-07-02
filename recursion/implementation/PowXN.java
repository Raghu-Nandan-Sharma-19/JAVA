package recursion.implementation;

import java.util.Scanner;

public class PowXN {
    private static double myPow(double x, int n) {
        double ans = 1;

        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                x = x * x;
                n = n / 2;
            }
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
