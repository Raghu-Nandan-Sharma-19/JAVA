package step1.problems;

import java.util.Scanner;

public class PrintFullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();

        System.out.println("Enter second name : ");
        String lastName = sc.nextLine();

        System.out.println("Full name is : " + firstName + " " + lastName);

        sc.close();
    }
}
