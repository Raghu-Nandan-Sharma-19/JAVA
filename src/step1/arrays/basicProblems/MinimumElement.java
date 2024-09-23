package step1.arrays.basicProblems;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int number : numbers) {
            if(number < min) {
                min = number;
            }
        }

        System.out.println("Minimum element is : " + min);

        sc.close();
    }
}
