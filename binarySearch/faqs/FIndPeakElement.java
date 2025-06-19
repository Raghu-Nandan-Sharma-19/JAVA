package binarySearch.faqs;

import java.util.Scanner;

public class FIndPeakElement {
    private static int findPeakElement(int[] arr) {
        // Store the length of the array
        int n = arr.length;
        
        // Handle edge case: single element array is always a peak
        if (n == 1) return 0;
        
        // Handle edge case: if first element is peak (greater than second element)
        if (arr[0] > arr[1]) return 0; 
        
        // Handle edge case: if last element is peak (greater than second last)
        if (arr[n - 2] < arr[n - 1]) return n - 1;

        // Search in the range excluding first and last elements (already checked)
        int low = 1;
        int high = n - 2;

        while (low <= high) {
            // Find middle index avoiding integer overflow
            int mid = low + (high - low) / 2;

            // Check if mid is a peak (greater than both neighbors)
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // If mid is ascending on left side, peak must be on right side
            if (arr[mid - 1] < arr[mid]) {
                low = mid + 1;
            } else { // Otherwise, peak must be on left side
                high = mid - 1;
            }
        }

        // No peak found (shouldn't reach here for valid inputs)
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findPeakElement(arr));

        scanner.close();
    }
}
