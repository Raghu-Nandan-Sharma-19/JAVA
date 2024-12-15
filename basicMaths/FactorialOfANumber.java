package basicMaths;

import java.util.Scanner;

class Factorial {
    public int factorial(int num) {
        int ans = 1;

        for(int i = 1; i <= num; i++) {
            ans *= i;
        }

        return ans;
    }
}

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(num));
        scanner.close();
    }
}
