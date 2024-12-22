import java.util.Scanner;

class CheckIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256], tMap = new int[256];
        int n = s.length();

        for(int i = 0; i < n; i++) {
            if(sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }
            sMap[s.charAt(i)] = i+1;
            tMap[t.charAt(i)] = i+1;
        }

        return true;
    }
}

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        CheckIsomorphic checkIsomorphic = new CheckIsomorphic();
        System.out.println(checkIsomorphic.isIsomorphic(s, t));
        scanner.close(); 
    }
}
