package basicArrays;

import java.util.ArrayList;
import java.util.Scanner;

class GetArraySum {
    public int sumOfArray(ArrayList<Integer> numbers) {
        int n = numbers.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers.get(i);
        }

        return sum;
    }
}

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        GetArraySum getArraySum = new GetArraySum();
        System.out.println(getArraySum.sumOfArray(numbers));

        scanner.close();
    }
}
