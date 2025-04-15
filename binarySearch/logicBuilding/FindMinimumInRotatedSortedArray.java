package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    private static int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) < mini) {
                mini = arr.get(i);
            }
        }

        return mini;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }

        System.out.println(findMin(arr));

        scanner.close();
    }
}
