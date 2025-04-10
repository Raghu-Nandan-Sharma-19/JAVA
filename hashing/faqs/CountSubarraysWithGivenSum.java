package hashing.faqs;

import java.util.Scanner;

public class CountSubarraysWithGivenSum {
    private static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }

                if (sum == k) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(subarraySum(nums, k));

        scanner.close();
    }
}
