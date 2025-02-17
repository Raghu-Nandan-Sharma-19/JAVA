package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GetSum {
    public int sumOfHighestAndLowestFrequency(int[] arr, int n) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (var el : arr) {
            mpp.put(el, mpp.getOrDefault(el, 0) + 1);
        }

        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int frequency = it.getValue();
            maxFrequency = Integer.max(maxFrequency, frequency);
            minFrequency = Integer.min(minFrequency, frequency);
        }

        return maxFrequency + minFrequency;
    }
}

public class SumOfHighestAndLowestFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        GetSum getSum = new GetSum();
        System.out.println(getSum.sumOfHighestAndLowestFrequency(arr, n));

        scanner.close();
    }
}
