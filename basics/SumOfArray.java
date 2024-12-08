package basics;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        // for(int i = 0; i < size; i++) {
        //     sum += numbers[i];
        // }

        for(int number : numbers) {
            sum += number;
        }

        System.out.println(sum);

        scanner.close();
    }
}
