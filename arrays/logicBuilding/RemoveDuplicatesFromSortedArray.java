package arrays.logicBuilding;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    private class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            
            for(int j = 1; j < nums.length; j++) {
                if(nums[j] != nums[i]) {
                    nums[i+1] = nums[j];
                    i++;
                }
            }

            for(int j = 0; j <= i; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();

            return (i+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new RemoveDuplicatesFromSortedArray().new Solution();
        System.out.println(sol.removeDuplicates(nums));

        scanner.close();
    }
}
