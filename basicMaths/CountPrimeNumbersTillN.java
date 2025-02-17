package basicMaths;

import java.util.Scanner;

class PrimeNumberCount {
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public int countPrimeNumbers(int num) {
        int countOfPrimes = 0;
        
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                countOfPrimes++;
            }
        }

        return countOfPrimes;
    }
}

public class CountPrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PrimeNumberCount primeNumberCount = new PrimeNumberCount();
        System.out.println(primeNumberCount.countPrimeNumbers(num));
        scanner.close();
    }
}
