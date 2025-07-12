package recursion.faqHard;

import java.util.Scanner;

public class WordSearch {
    private static boolean solve(char[][] board, int i, int j, String word, int k) {
        // If all characters are matched, return true
        if (k == word.length()) {
            return true;
        }

        // Check for out-of-bounds or character mismatch
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(k) != board[i][j]) {
            return false;
        }

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = ' ';

        // Explore all four directions (down, up, right, left)
        boolean ans = solve(board, i + 1, j, word, k + 1) ||
                      solve(board, i - 1, j, word, k + 1) ||
                      solve(board, i, j + 1, word, k + 1) ||
                      solve(board, i, j - 1, word, k + 1);

        // Restore the original value in the cell (backtrack)
        board[i][j] = temp;
        
        // Return true if any path matches the word
        return ans;
    }

    private static boolean exist(char[][] board, String word) {
        // Iterate over every cell in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // If the current cell matches the first character of the word
                if (board[i][j] == word.charAt(0)) {
                    // Start the recursive search from this cell
                    if (solve(board, i, j, word, 0)) {
                    return true; // Word found in the board
                    }
                }
            }
        }

        // Word not found in the board
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }

        String word = scanner.next();

        System.out.println(exist(board, word));

        scanner.close();
    }
}
