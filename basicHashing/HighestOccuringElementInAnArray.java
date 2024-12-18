package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HighestOccuringElement {
    public int highestOccuring(int[] arr, int n) {
        Map<Integer, Integer> mpp = new HashMap<>();
        
        for(int el : arr) {
            mpp.put(el, mpp.getOrDefault(el, 0) + 1);
        }

        int maxElement = -1, maxFrequency = -1;
        for(var el : mpp.entrySet()) {
            int element = el.getKey();
            int frequency = el.getValue();
            if(frequency > maxFrequency) {
                maxElement = element;
                maxFrequency = frequency;
            } else if(frequency == maxFrequency) {
                maxElement = Math.min(maxElement, element);
            }
        }

        return maxElement;
    }
}

public class HighestOccuringElementInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        HighestOccuringElement highestOccuringElement = new HighestOccuringElement();
        System.out.println(highestOccuringElement.highestOccuring(numbers, n));

        scanner.close();
    }
}
