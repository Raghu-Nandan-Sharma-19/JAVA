package binarySearch.faqs;

import java.util.Scanner;

public class KthElementOfTwoSortedArrays {
    private static int kthElement(int[] a, int[] b, int k) {
        int n1 = a.length;
        int n2 = b.length;

        if (n1 > n2) {
            return kthElement(b, a, k);
        }

        int left = k;
        
        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(kthElement(a, b, k));

        scanner.close();
    }
}
