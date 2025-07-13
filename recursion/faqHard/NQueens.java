package recursion.faqHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    private static boolean safe(List<String> board, int row, int col) {
        // Check upper-left diagonal for another queen
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
            c--;
        }

        // Check left side of the current row for another queen
        r = row;
        c = col;
        while (c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            c--;
        }

        // Check lower-left diagonal for another queen
        r = row;
        c = col;
        while (r < board.size() && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r++;
            c--;
        }

        // No conflicts found, it's safe to place the queen
        return true;
    }

    private static void func(int col, List<List<String>> ans, List<String> board) {
        // If all columns are filled, a valid solution is found
        if (col == board.size()) {
            ans.add(new ArrayList<>(board)); // Add a copy of the current board to the answer list
            return;
        }

        // Try placing a queen in each row of the current column
        for (int row = 0; row < board.size(); row++) {
            // Check if it's safe to place a queen at (row, col)
            if (safe(board, row, col)) {
                // Place the queen
                char[] charArray = board.get(row).toCharArray();
                charArray[col] = 'Q';
                board.set(row, new String(charArray));
                
                // Recurse for the next column
                func(col + 1, ans, board);

                // Backtrack: remove the queen
                charArray[col] = '.';
                board.set(row, new String(charArray));
            }
        }
    }

    private static List<List<String>> solveNQueens(int n) {
        // List to store all possible solutions
        List<List<String>> ans = new ArrayList<>();

        // List to represent the current board configuration
        List<String> board = new ArrayList<>();
        
        // String representing an empty row
        String s = ".".repeat(n);
        
        // Initialize the board with empty rows
        for (int i = 0; i < n; i++) {
            board.add(s);
        }

        // Start the recursive backtracking from the first column
        func(0, ans, board);
        
        // Return all the valid board configurations
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (var row : solveNQueens(n)) {
            for (var col : row) {
                System.out.println(col);
            }
            System.out.println();
        }

        scanner.close();
    }
}
