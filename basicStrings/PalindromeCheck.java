import java.util.Scanner;

class CheckPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        
        if(checkPalindrome.isPalindrome(s)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        scanner.close();
    }
}
