package hashing.faqs;

import java.util.Scanner;

public class CountSubarraysWithGivenXorK {
    private static int subarraysWithXorK(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int xorr = 0;
            
            for (int j = i; j < n; j++) {
                xorr ^= nums[j];

                if (xorr == k) {
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

        System.out.println(subarraysWithXorK(nums, k));

        scanner.close();
    }
}
