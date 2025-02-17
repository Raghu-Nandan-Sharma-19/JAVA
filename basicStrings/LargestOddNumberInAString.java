import java.util.Scanner;

class GetLargestOdd {
    public String largestOddNum(String s) {
        int j = -1;
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            // converting to integer
            if ((s.charAt(i) - '0') % 2 == 1) {
                j = i;
                break;
            }
        }

        if (j == -1) return "";

        int i = 0;
        while (i < n) {
            if (s.charAt(i) != '0') break;
            i++;
        }

        return s.substring(i, j + 1);
    }
}

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        GetLargestOdd getLargestOdd = new GetLargestOdd();
        System.out.println(getLargestOdd.largestOddNum(s));
        scanner.close();
    }
}
