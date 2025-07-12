package recursion.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
    private static boolean isPalindrome(String s, int start, int end) {
        // Check if the substring s[start...end] is a palindrome
        while (start < end) {
            // If characters at current positions don't match, it's not a palindrome
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            // Move towards the center
            start++;
            end--;
        }
        // If all characters matched, it's a palindrome
        return true;
    }

    private static void solve(int idx, String s, List<String> path, List<List<String>> res) {
        // If we've reached the end of the string, add the current partition to the result
        if (idx == s.length()) {
            res.add(new ArrayList<>(path));
        }

        // Try every possible end index for the current substring
        for (int i = idx; i < s.length(); i++) {
            // Check if the substring s[idx...i] is a palindrome
            if (isPalindrome(s, idx, i)) {
                // If it is, add it to the current path
                path.add(s.substring(idx, i + 1));
                
                // Recurse for the remaining substring
                solve(i + 1, s, path, res);
                
                // Backtrack: remove the last added substring
                path.remove(path.size() - 1);
            }
        }
    }

    private static List<List<String>> partition(String s) {
        // List to store the current partition path
        List<String> path = new ArrayList<>();

        // List to store all possible palindrome partitions
        List<List<String>> res = new ArrayList<>();
        
        // Start the recursive partitioning from index 0
        solve(0, s, path, res);
        
        // Return the list of all palindrome partitions
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        for (List<String> row : partition(s)) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
