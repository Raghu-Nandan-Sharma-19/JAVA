package step1.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            // space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
