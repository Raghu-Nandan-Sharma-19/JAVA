package binarySearch.faqs;

import java.util.Scanner;

public class MinimizeMaxDistanceToGasStations {
    private static int numberOfGasStationsRequired(double distance, int[] arr) {
        // Length of the array
        int n = arr.length;

        // Counter for the number of gas stations required
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            // Calculate how many gas stations can fit between two consecutive stations
            // if they're spaced 'distance' apart
            int numberInBetween = (int) ((arr[i] - arr[i - 1]) / distance);

            // Edge case: if the division is exact, we need one less station
            // (since exact division means a station would be placed exactly at the end point)
            if ((arr[i] - arr[i - 1]) == (distance * numberInBetween)) {
                numberInBetween--;
            }

            // Add the number of stations needed for this segment to the total
            cnt += numberInBetween;
        }

        // Return the total number of gas stations required
        return cnt;
    }

    private static double minimiseMaxDistance(int[] arr, int k) {
        // Length of the array
        int n = arr.length;
        
        // Initialize binary search boundaries
        double low = 0;
        double high = 0;

        // Find maximum distance between any two adjacent gas stations
        // This will be our upper bound for binary search
        for (int i = 0; i < (n - 1); i++) {
            high = Math.max(high, (arr[i + 1] - arr[i]));
        }

        // Set precision for our binary search
        double difference = 1e-6;

        // Binary search to find minimum value of maximum distance
        while ((high - low) > difference) {
            // Calculate mid point
            double mid = low + (high - low) / 2;
            // Find how many gas stations we need with this maximum distance
            int cnt = numberOfGasStationsRequired(mid, arr);
        
            // If we need more than k gas stations, the distance is too small
            if (cnt > k) {
                low = mid;
            } else {
                // If we need less than or equal to k gas stations, we might be able to increase 
                // the minimum distance
                high = mid;
            }
        }

        // Return the minimum possible value of maximum distance
        return high;
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
