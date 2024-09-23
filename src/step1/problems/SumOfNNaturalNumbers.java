package step1.problems;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of " + num + " natural numbers is : " + sum);

        sc.close();
    }
}
