package recursion.faqHard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RatInAMaze {
    private static List<String> result = new ArrayList<>();

    private static void path(int[][] m, int x, int y, String dir, int n) {
        // If destination is reached, add the path to result and return
        if (x == n - 1 && y == n - 1) {
            result.add(dir);
            return;
        }

        // If the current cell is blocked, return
        if (m[x][y] == 0) return;

        // Mark the current cell as visited
        m[x][y] = 0;

        // Move Up if possible
        if (x > 0) path(m, x - 1, y, dir + 'U', n);
        // Move Left if possible
        if (y > 0) path(m, x, y - 1, dir + 'L', n);
        // Move Down if possible
        if (x < n - 1) path(m, x + 1, y, dir + 'D', n);
        // Move Right if possible
        if (y < n - 1) path(m, x, y + 1, dir + 'R', n);

        // Unmark the current cell (backtrack)
        m[x][y] = 1;
    }

    private static List<String> findPath(int[][] grid) {
        int n = grid.length;

        // Clear previous results before starting a new search
        result.clear();

        // If the start or end cell is blocked, return empty result
        if (grid[0][0] == 0 || grid[n - 1][n - 1] == 0) {
            return result;
        }

        // Start searching for all possible paths from (0,0)
        path(grid, 0, 0, "", n);

        // Sort the result lexicographically
        Collections.sort(result);

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        for (var str : findPath(grid)) {
            System.out.println(str);
        }

        scanner.close();
    }
}
