package binarySearch.faqs;

import java.util.Scanner;

public class BookAllocation {
    // Method to find max element in array
    private static int maxElement(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;

        for (var num : nums) {
            maxi = Math.max(num, maxi);
        }

        return maxi;
    }

    // method to find sum of elements of array
    private static int sum(int[] nums, int n) {
        int sum = 0;

        for (var num : nums) {
            sum += num;
        }

        return sum;
    }

    private static int countStudents(int[] nums, int n, int pages) {
        // Initialize the number of students required to 1
        int student = 1;

        // Initialize the current number of pages allocated to a student
        int pagesStudent = 0;

        // Iterate through each book
        for (int i = 0; i < n; i++) {
            // If adding the current book does not exceed the page limit
            if ((pagesStudent + nums[i]) <= pages) {
                // Allocate book to current student
                pagesStudent += nums[i]; 
            } else {
                // Allocate books to next student
                student++;

                // Start counting pages for new student
                pagesStudent = nums[i];
            }
        }

        // Return the total number of students required
        return student;
    }

    private static int findPages(int[] nums, int m) {
        int n = nums.length;

        // If there are more students than books, allocation is not possible
        if (m > n) return -1;

        /* The minimum possible value is the maximum element
           (no student can get less than the largest book) */
        int low = maxElement(nums, n);
        /* The maximum possible value is the sum of all pages 
           (one student gets all books) */
        int high = sum(nums, n);

        // Binary search to find the minimum possible maximum pages
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If more students are needed, increase the minimum possible value
            if (countStudents(nums, n, mid) > m) {
                low = mid + 1;
            } else {
                // Otherwise, try for a better (smaller) maximum
                high = mid - 1;
            }
        }

        // The lowest value for which allocation is possible
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
