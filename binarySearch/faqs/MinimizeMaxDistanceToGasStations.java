package binarySearch.faqs;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimizeMaxDistanceToGasStations {
    private static double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;

        int[] howMany = new int[n - 1];
        
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < (n - 1); i++) {
            double distance = (arr[i + 1] - arr[i]);
            pq.offer(new double[]{distance, i});
        }

        for (int gasStations = 1; gasStations <= k; gasStations++) {
            double[] top = pq.poll();
            int secondIdx = (int) (top[1]);
            howMany[secondIdx]++;
            double initialDistance = (arr[secondIdx + 1] - arr[secondIdx]);
            double newSectionLength = (initialDistance / (howMany[secondIdx] + 1));
            pq.offer(new double[]{newSectionLength, secondIdx});
        }

        return pq.peek()[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.printf("%.5f", minimiseMaxDistance(arr, k));

        scanner.close();
    }
}
