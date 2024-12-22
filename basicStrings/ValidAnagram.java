import java.util.Scanner;

class CheckAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freqS = new int[26], freqT = new int[26];
        int n = s.length();

        for(int i = 0; i < n; i++) {
            freqS[s.charAt(i)-'a']++;
            freqT[t.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(freqS[i] != freqT[i]) {
                return false;
            }
        }

        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        CheckAnagram checkAnagram = new CheckAnagram();
        System.out.println(checkAnagram.isAnagram(s, t));
        scanner.close();
    }
}
