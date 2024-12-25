package sorting;

import java.util.Scanner;

public class BubbleSort {
    private class Solution {
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        public int[] bubbleSort(int[] nums) {
            int n = nums.length;

            for(int i = n-1; i >= 1; i--) {
                boolean didSwap = false;
                
                for(int j = 0; j < i; j++) {
                    if(nums[j] > nums[j+1]) {
                        swap(nums, j, j+1);
                        didSwap = true;
                    }
                } 

                if(didSwap == false) {
                    break;
                }
            }

            return nums;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new BubbleSort().new Solution();
        int[] ans = sol.bubbleSort(nums);
        for(int el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
