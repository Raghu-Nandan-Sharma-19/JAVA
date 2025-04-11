package binarySearch.fundamentals;

import java.util.Scanner;

public class LowerBound {
    private static int lowerBound(int[] nums, int x) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] >= x) {
                return i;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }   

        int x = scanner.nextInt();

        System.out.println(lowerBound(nums, x));

        scanner.close();
    }
}
