package basicArrays;

import java.util.Scanner;

class CheckIfSorted {
    public boolean isSorted(int[] numbers, int size) {
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

public class CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        CheckIfSorted checkIfSorted = new CheckIfSorted();
        System.out.println(checkIfSorted.isSorted(numbers, size));

        scanner.close();
    }
}
