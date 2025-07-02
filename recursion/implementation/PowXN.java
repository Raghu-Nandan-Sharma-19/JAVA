package recursion.implementation;

import java.util.Scanner;

public class PowXN {
    private static double power(double x, int n) {
        // Base case 1: x^0 = 1
        if (n == 0) {
            return 1.0;
        }

        // Base case 2: x^1 = x
        if (n == 1) {
            return x;
        }

        // For odd powers: x^n = x * x^(n-1)
        if (n % 2 == 1) {
            return x * power(x, n - 1);
        }

        // For even powers: x^n = (x^2)^(n/2)
        // This optimization reduces the number of recursive calls
        return power(x * x, n / 2);
    }

    private static double myPow(double x, int n) {
        // Handle negative exponents by using the property: x^(-n) = 1/(x^n)
        if (n < 0) {
            // For negative n, compute 1/(x^|n|)
            // Note: We convert -n to positive to avoid integer
            // overflow for n = Integer.MIN_VALUE
            return 1.0 / power(x, -n);
        }

        // For positive or zero exponents, use the power helper function directly
        return power(x, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        
        System.out.println(myPow(x, n));

        scanner.close();
    }
}
