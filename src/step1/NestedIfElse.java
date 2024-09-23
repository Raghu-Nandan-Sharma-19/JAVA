package step1;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        if(a > b) {
            System.out.println("a is bigger than b");
            if(a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is largest " + a);
            } else {
                System.out.println("c is bigger than a");
                System.out.println("c is largest " + c);
            }
        } else {
            System.out.println("b is bigger than a");
            if(b > c) {
                System.out.println("b is bigger than c");
                System.out.println("b is largest " + b);
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is largest");
            }
        }

        sc.close();
    }
}
