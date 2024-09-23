package step1.patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int iniS = 0;
        for(int i = 0; i < n; i++) {
            // stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }

        iniS = 2 * n - 2;
        for(int i = 1; i <= n; i++) {
            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }

        sc.close();
    }
}
