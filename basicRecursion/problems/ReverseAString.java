package basicRecursion.problems;

import java.util.Scanner;
import java.util.Vector;

public class ReverseAString {
    private class Solution {
        private void swap(Vector<Character> s, int left, int right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
        }

        private void reverse(Vector<Character> s, int left, int right) {
            if(left >= right) {
                return;
            }
            swap(s, left, right);
            reverse(s, left+1, right-1);
        }

        public Vector<Character> reverseString(Vector<Character> s) {
            int n = s.size();
            int left = 0, right = n-1;
            reverse(s, left, right);
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vector<Character> s = new Vector<>();

        for(int i = 0; i < n; i++) {
            char element = scanner.next().charAt(0);
            s.add(element);
        }

        Solution sol = new ReverseAString().new Solution();
        Vector<Character> ans = sol.reverseString(s);
        
        for(Character el : ans) {
            System.out.print(el + " ");
        }
        System.out.println();

        scanner.close();
    }
}
