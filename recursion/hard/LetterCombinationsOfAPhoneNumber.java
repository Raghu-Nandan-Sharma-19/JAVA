package recursion.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationsOfAPhoneNumber {
    // Mapping of digits to corresponding letters on a phone keypad
    // Index 0 and 1 are empty strings as digits 0 and 1 do not map to any letters
    private static final String[] map = new String[]{
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    private static void solve(String digits, List<String> ans, int idx, String current) {
        // If we've reached the end of the digits, add the current combination to the answer list
        if (idx == digits.length()) {
            ans.add(current);
            return;
        }

        // Get the possible letters for the current digit
        String s = map[digits.charAt(idx) - '0'];

        // For each letter, append it to the current combination and recurse for the next digit
        for (int i = 0; i < s.length(); i++) {
            solve(digits, ans, idx + 1, current + s.charAt(i));
        }
    }
     
    private static List<String> letterCombinations(String digits) {
        // Create a list to store the combinations
        List<String> ans = new ArrayList<>();
        // If the input is empty, return the empty list
        if (digits.length() == 0) return ans;
        // Start the recursive process to generate combinations
        solve(digits, ans, 0, "");
        // Return the list of combinations
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.next();

        System.out.println(letterCombinations(digits));

        scanner.close();
    }
}
