package basicMaths;

import java.util.Scanner;

class PerfectNumber {
    public boolean isPerfect(int num) {
        int sum = 1;

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                sum += i;
                if(i != (num / i)) sum += (num / i);
            }
        }

        return sum == num;
    }
}

public class CheckForPerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.isPerfect(num));
        scanner.close();
    }
}
