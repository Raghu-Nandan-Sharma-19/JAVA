package step1.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int start;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) start = 1;
            else start = 0;
            for(int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
