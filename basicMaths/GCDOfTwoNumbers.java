package basicMaths;

import java.util.Scanner;

class FindGCD {
    public int GCD(int n1, int n2) {
        while(n1 != 0 && n2 != 0) {
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if(n2 == 0) return n1;
        return n2;
    }
}

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        FindGCD findGCD = new FindGCD();
        System.out.println(findGCD.GCD(n1, n2));
        scanner.close();
    }
}
