package step1;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day : ");
        int day = sc.nextInt();

        if(day == 1) {
            System.out.println("Go to home");
        } else if(day == 2) {
            System.out.println("Go to village");
        } else {
            System.out.println("Go to office");
        }

        sc.close();
    }
}
