package arrays.faqMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    private static class Solution {
        // type 1 :- given r and c return the element at that place
        public int type1(int R, int C) {
            // taking n as R - 1
            int n = R - 1;
            // taking r as C - 1
            int r = C - 1;
            // taking result as 1
            int res = 1;

            // iterating from 0 till r - 1
            for (int i = 0; i < r; i++) {
                // multiplying result with (n - i)
                res *= (n - i);
                // dividing result by (i + 1)
                res /= (i + 1);
            }

            // returning the result
            return res;
        }

        // type 2 :- Given the row number n, print the nth row of pascal's triangle
        public List<Integer> type2(int row) {
            // row list to store the answer row
            List<Integer> rowList = new ArrayList<>();
            // initializing ans as 1
            int ans = 1;
            // adding ans to row list
            rowList.add(ans);
            
            // iterating from 1 till row - 1
            for (int i = 1; i < row; i++) {
                // multiplying ans with row - i
                ans *= (row - i);
                // dividing ans by i
                ans /= i;
                // adding ans to row list
                rowList.add(ans);
            }

            // returning the row list
            return rowList;
        }

        // type 3 :- given the row number n, print entire pascal triangle till n
        public List<List<Integer>> type3(int n) {
            // double list to store pascal triangle
            List<List<Integer>> pascalTriangle = new ArrayList<>();

            // iterate from 1 to n
            for (int i = 1; i <= n; i++) {
                // generating the row using the type 2 function
                pascalTriangle.add(type2(i));
            }

            // returning the pascal triangle
            return pascalTriangle;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // type 1
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println("Output for type 1: ");
        System.out.println(solution.type1(R, C));
        System.out.println();

        // type 2
        int row = scanner.nextInt();
        System.out.println("Output for type 2: ");
        System.out.println(solution.type2(row));
        System.out.println();

        // type 3
        int n = scanner.nextInt();
        System.out.println("Output for type 3: ");
        System.out.println(solution.type3(n));
        System.out.println();

        scanner.close();
    }
}
