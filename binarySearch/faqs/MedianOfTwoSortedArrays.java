package binarySearch.faqs;

import java.util.ArrayList;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    private static double median(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        
        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) arr3.add(arr1[i++]);
            else arr3.add(arr2[j++]);         
        }

        while (i < n1) {
            arr3.add(arr1[i++]);
        }

        while (j < n2) {
            arr3.add(arr2[j++]);
        }

        if (n % 2 == 1) {
            return (double) arr3.get(n / 2);
        }

        double result = ((double) arr3.get(n / 2) + (double) (arr3.get((n / 2) - 1))) / 2.0;
    
        return result;
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
