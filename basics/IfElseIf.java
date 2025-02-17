package basics;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        /*
         * Given marks of a student, tell us the grade
         * he or she will be getting :-
         *  - Grade A (>= 90)
         *  - Grade B (>= 70 and < 90)
         *  - Grade C (>= 50 and < 70)
         *  - Grade D (>= 35 and < 50)
         *  - Fail (< 35)   
         */

        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");            
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
