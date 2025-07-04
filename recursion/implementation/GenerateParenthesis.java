package recursion.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    private static void generate(int open, int close, int n, String current, List<String> result) {
        // Base case: if the number of open and close parentheses are equal to n,
        // we have a valid combination. Add it to the result.
        // The condition `(open + close) == (2 * n)` is equivalent to `open == n && close == n`
        // because `open` and `close` can't exceed `n`.
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If the number of open parentheses is less than n, we can add an open parenthesis.
        if (open < n) {
            generate(open + 1, close, n, current + '(', result);
        }

        // If the number of close parentheses is less than the number of open parentheses,
        // we can add a close parenthesis. This ensures the parentheses are well-formed.
        if (close < open) {
            generate(open, close + 1, n, current + ')', result);
        }
    }

    private static List<String> generateParenthesis(int n) {
        // Create a list to store the results.
        List<String> result = new ArrayList<>();
        // Start the recursive generation with initial values.
        generate(0, 0, n, "", result);
        // Return the list of generated parentheses.
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generateParenthesis(n));
        scanner.close();
    }
}
