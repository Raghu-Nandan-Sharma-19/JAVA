package recursion.faqHard;

import java.util.Scanner;

public class SudokuSolver {
    private static boolean areRulesMet(char[][] board, int row, int col, char digit) {
        // Check if the digit is already present in the current row or column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false; // Digit already exists in row or column
            }
        }

        // Calculate the starting indices of the 3x3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        // Check if the digit is already present in the 3x3 subgrid
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false; // Digit already exists in the subgrid
                }
            }
        }

        // If digit is not present in row, column, or subgrid, placement is valid
        return true;
    }
    
    private static boolean solve(char[][] board) {
        int n = 9;

        // Traverse each cell in the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is empty
                if (board[i][j] == '.') {
                    // Try all possible digits from '1' to '9'
                    for (char digit = '1'; digit <= '9'; digit++) {
                        // Check if placing the digit is valid
                        if (areRulesMet(board, i, j, digit)) {
                            board[i][j] = digit; // Place the digit

                            // Recursively try to solve the rest of the board
                            if (solve(board)) {
                                return true; // If solved, return true
                            } else {
                                board[i][j] = '.'; // Backtrack if not solvable
                            }
                        }
                    }

                    // If no digit can be placed, return false (trigger backtracking)
                    return false;
                }
            }
        }

        // If all cells are filled correctly, return true
        return true;
    }


    public static void solveSudoku(char[][] board) {
        // Call the recursive backtracking solver to fill the Sudoku board
        solve(board);
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

        solve(board);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
