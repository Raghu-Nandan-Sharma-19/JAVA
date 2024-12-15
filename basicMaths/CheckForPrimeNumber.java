package basicMaths;

import java.util.Scanner;

class PrimeNumberCheck {
    public boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class CheckForPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
        System.out.println(primeNumberCheck.isPrime(num));
        scanner.close();
    }
}
