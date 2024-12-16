package basicArrays;

import java.util.Scanner;

class GetOddNumbersCount {
    public int countOddNumbers(int[] numbers, int size) {
        int countOdd = 0;

        for(int i = 0; i < size; i++) {
            if(numbers[i] % 2 == 1) {
                countOdd++;
            }
        }

        return countOdd;
    }
}

public class CountOddNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        GetOddNumbersCount getOddNumbersCount = new GetOddNumbersCount();
        System.out.println(getOddNumbersCount.countOddNumbers(numbers, size));

        scanner.close();
    }
}
