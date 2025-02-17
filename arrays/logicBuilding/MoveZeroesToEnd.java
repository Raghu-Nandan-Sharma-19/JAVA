package arrays.logicBuilding;

import java.util.Scanner;

public class MoveZeroesToEnd {
    private class Solution {
        // Method to print the array
        private void printArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        // Method to swap two elements in the array
        private void swap(int[] nums, int num1, int num2) {
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
        }

        // Method to move all zeroes in the array to the end
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int j = -1;

            // Find the first occurrence of zero
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    j = i;
                    break;
                } 
            }

            // Move non-zero elements to the front and zeroes to the end
            for (int i = j+1; i < n; i++) {
                if (nums[i] != 0) {
                    swap(nums, i, j);
                    j++;
                }
            }

            // Print the modified array
            printArray(nums);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new MoveZeroesToEnd().new Solution();
        sol.moveZeroes(nums);

        scanner.close();
    }
}
