package step1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You c1an vote");
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot vote");
            System.out.println("You cannot drive");
        }

        sc.close();
    }
}
