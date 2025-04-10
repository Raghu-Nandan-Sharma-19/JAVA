package hashing.contest;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraysWithSumDivisibleByK {
    private static int subarraySumDivisbleByK(int[] nums, int k) {
        HashMap<Integer, Integer> remainderFreq = new HashMap<>();
        remainderFreq.put(0, 1); 

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            int remainder = sum % k;

            if (remainder < 0) {
                remainder += k;
            }

            count += remainderFreq.getOrDefault(remainder, 0);
            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(subarraySumDivisbleByK(nums, k));

        scanner.close();
    }
}
