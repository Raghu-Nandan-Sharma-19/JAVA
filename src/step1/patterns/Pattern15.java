package step1.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int spaces = 2 * n - 2;
        for(int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if(i > n) stars = 2 * n - i;

            // stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if(i < n) spaces -= 2;
            else spaces += 2;
        }

        sc.close();
    }
}
