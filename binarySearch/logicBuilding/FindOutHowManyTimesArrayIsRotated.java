package binarySearch.logicBuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOutHowManyTimesArrayIsRotated {
    private static int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int minimum = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < minimum) {
                minimum = nums.get(i);
                index = i;
            }
        }

        return index;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }
        
        System.out.println(findKRotation(nums));

        scanner.close();
    }
}
