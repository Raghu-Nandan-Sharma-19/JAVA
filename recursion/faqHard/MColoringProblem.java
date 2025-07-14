package recursion.faqHard;

import java.util.ArrayList;
import java.util.List;

public class MColoringProblem {
    private static boolean isSafe(int col, int node, int[] colors, List<List<Integer>> adj) {
        // Check all adjacent nodes (neighbors) of the current node
        for (int neighbor : adj.get(node)) {
            // If any neighbor has the same color, it's not safe to assign this color
            if (colors[neighbor] == col) return false;
        }
        // If no neighbor has the same color, it's safe to assign this color
        return true;
    }

    private static boolean solve(int node, int m, int n, int[] colors, List<List<Integer>> adj) {
        // If all nodes have been assigned a color, return true
        if (n == node) return true;

        // Try all colors for the current node
        for (int i = 1; i <= m; i++) {
            // Check if assigning color i to node is safe
            if (isSafe(i, node, colors, adj)) {
                colors[node] = i; // Assign color i
                // Recur to assign colors to the next node
                if (solve(node + 1, m, n, colors, adj)) {
                    return true;
                }
                colors[node] = 0; // Backtrack if coloring fails
            }
        }

        // If no color can be assigned to this node, return false
        return false;
    }

    private static boolean graphColoring(int[][] edges, int m, int n) {
        // Create adjacency list for the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Populate adjacency list from the edge list
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Array to store colors assigned to each node (0 means uncolored)
        int[] colors = new int[n];

        // Start solving the coloring problem from node 0
        return solve(0, m, n, colors, adj);
    }
    
    public static void main(String[] args) {
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 2}, {1, 3}
        };
        
        int m = 3;
        int n = 4;

        if (graphColoring(edges, m, n)) {
            System.out.println("The graph can be colored with " + m + " colors.");
        } else {
            System.out.println("The graph cannot be colored with " + m + " colors.");
        }
    }
}
