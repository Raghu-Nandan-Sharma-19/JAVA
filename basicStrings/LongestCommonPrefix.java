import java.util.Arrays;
import java.util.Scanner;

class GetLongestPrefix {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        int n = v.length;
        String first = v[0], last = v[n - 1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] v = new String[n];
        
        for(int i = 0; i < n; i++) {
            v[i] = scanner.next();
        }

        GetLongestPrefix getLongestPrefix = new GetLongestPrefix();
        System.out.println(getLongestPrefix.longestCommonPrefix(v));

        scanner.close();
    }
}
