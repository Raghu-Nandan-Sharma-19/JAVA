package basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
         * Given an age, print "Adult" if age >= 18, or 
         * print "Teen"
         */
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }

        scanner.close();
    }
}
