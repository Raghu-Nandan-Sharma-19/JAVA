package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SecondHighestOccuring {
    public int secondMostFrequent(int[] arr, int n) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int el : arr) {
            mpp.put(el, mpp.getOrDefault(el, 0) + 1);
        }

        int maxElement = -1, secondMaxElement = -1;
        int maxFrequency = -1, secondMaxFrequency = -1;

        for (var el : mpp.entrySet()) {
            int element = el.getKey(), frequency = el.getValue();
            
            if (frequency > maxFrequency) {
                secondMaxElement = maxElement;
                secondMaxFrequency = maxFrequency;
                maxElement = element;
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                maxElement = Math.min(element, maxElement);
            } else if (frequency > secondMaxFrequency) {
                secondMaxFrequency = frequency;
                secondMaxElement = element;
            } else if (frequency == secondMaxFrequency) {
                secondMaxElement = Math.min(secondMaxElement, element);
            }
        }

        return secondMaxElement;
    }
}

public class SecondHighestOccuringElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        SecondHighestOccuring secondHighest = new SecondHighestOccuring();
        System.out.println(secondHighest.secondMostFrequent(arr, n));

        scanner.close();
    }
}
