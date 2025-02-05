package arrays.logicBuilding;

import java.util.Scanner;

public class FindMissingNumber {
    private static class Solution {
        // // Optimal solution 1 --> using sum
        // public int missingNumber(int[] nums) {
        //     int n = nums.length;

        //     int sum1 = (n * (n + 1)) / 2; // sum1 to store sum of 1-n numbers
        //     int sum2 = 0; // sum2 to store sum of array elements

        //     // iterating through the array
        //     for (int num : nums) {
        //         // adding element to the sum
        //         sum2 += num;
        //     }

        //     // returning the difference of sum1 and sum2 which will give missing number
        //     return sum1 - sum2;
        // }

        // // optimal solution 2 --> using XOR
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int xor1 = 0; // xor1 to store xor of N numbers
            int xor2 = 0; // xor2 to store xor of elements in array

            // iterating through the array
            for (int i = 0; i < n; i++) {
                // calculating xor1 from 1 to n
                xor1 ^= (i + 1);
                // calculating xor2 of array elements
                xor2 ^= nums[i];
            }

            // returning the xor of xor1 and xor2 which will give missing number
            return xor1 ^ xor2;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        System.out.println(solution.missingNumber(nums));

        scanner.close();
    }
}
