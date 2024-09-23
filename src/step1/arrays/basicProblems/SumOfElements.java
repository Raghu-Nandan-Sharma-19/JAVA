package step1.arrays.basicProblems;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers : ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of elements of array is : " + sum);

        sc.close();
    }
}
