package binarySearch.faqs;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    private static double median(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int n = n1 + n2;
        int i = 0, j = 0;
        int idx2 = n / 2, idx1 = idx2 - 1;
        int el1 = -1, el2 = -1;
        int cnt = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (cnt == idx1) el1 = arr1[i];
                if (cnt == idx2) el2 = arr1[i];
                cnt++;
                i++; 
            } else {
                if (cnt == idx1) el1 = arr2[j];
                if (cnt == idx2) el2 = arr2[j];
                cnt++;
                j++;
            }
        }

        while (i < n1) {
            if (cnt == idx1) el1 = arr1[i];
            if (cnt == idx2) el2 = arr1[i];
            cnt++;
            i++;
        }

        while (j < n2) {
            if (cnt == idx1) el1 = arr2[j];
            if (cnt == idx2) el2 = arr2[j];
            cnt++;
            j++;
        }

        return (n % 2 == 1) ? el2 : ((double) (el1) + (double) (el2)) / 2.0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) { 
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println(median(arr1, arr2));

        scanner.close();
    }
}
