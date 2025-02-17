package basicMaths;

import java.util.Scanner;

class FindLCM {
    private int GCD(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if (n2 == 0) return n1;
        return n2;
    }

    public int LCM(int n1, int n2) {
        int gcd = GCD(n1, n2);
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }
}

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        FindLCM findLCM = new FindLCM();
        System.out.println(findLCM.LCM(n1, n2));
        scanner.close();
    }
}
