package binarySearch.faqs;

import java.util.Scanner;

public class MinimizeMaxDistanceToGasStations {
    private static double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;
        int[] howMany = new int[n - 1];

        for (int gasStation = 1; gasStation <= k; gasStation++) {
            double maxSection = -1;
            int maxIdx = -1;

            for (int i = 0; i < (n - 1); i++) {
                double difference = (arr[i + 1] - arr[i]);
                double sectionLength = difference / (double) (howMany[i] + 1);

                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxIdx = i;
                }
            }

            howMany[maxIdx]++;
        }

        double maxAns = -1;
        for (int i = 0; i < (n - 1); i++) {
            double difference = (arr[i + 1] - arr[i]);
            double sectionLength = (difference / (double) (howMany[i] + 1));
            maxAns = Math.max(maxAns, sectionLength);
        }

        return maxAns;
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
