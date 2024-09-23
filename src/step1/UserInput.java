package step1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        byte age = sc.nextByte();

        System.out.println("Your age is : " + age);

        sc.close();
    }
}
