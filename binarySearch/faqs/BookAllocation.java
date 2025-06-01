package binarySearch.faqs;

import java.util.Scanner;

public class BookAllocation {
    private static int maxElement(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;

        for (var num : nums) {
            maxi = Math.max(num, maxi);
        }

        return maxi;
    }

    private static int sum(int[] nums, int n) {
        int sum = 0;

        for (var num : nums) {
            sum += num;
        }

        return sum;
    }

    private static int countStudents(int[] nums, int n, int pages) {
        int student = 1;
        int pagesStudent = 0;

        for (int i = 0; i < n; i++) {
            if ((pagesStudent + nums[i]) <= pages) {
                pagesStudent += nums[i];
            } else {
                student++;
                pagesStudent = nums[i];
            }
        }

        return student;
    }

    private static int findPages(int[] nums, int m) {
        int n = nums.length;

        if (m > n) return -1;

        int low = maxElement(nums, n);
        int high = sum(nums, n);

        for (int pages = low; pages <= high; pages++) {
            int countStudent = countStudents(nums, n, pages);

            if (countStudent == m) {
                return pages;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        System.out.println(findPages(nums, m));

        scanner.close();
    }
}
