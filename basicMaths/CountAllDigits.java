package basicMaths;

import java.util.Scanner;

class CountDigits {
    public int countAllDigits(int num) {
        if (num == 0) return 1;
        int cnt = 0;

        while (num > 0) {
            num /= 10;
            cnt++;            
        }

        return cnt;
    }

    public int countDigits(int num) {
        if(num == 0) return 1;
        int cnt = (int)(Math.log10(num) + 1);
        return cnt;
    }
}

public class CountAllDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.countAllDigits(num));
        System.out.println(countDigits.countDigits(num));
        scanner.close();
    }
}
