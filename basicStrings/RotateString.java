import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CheckRotate {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);    
        }

        for(int i = 0; i < n; i++) {
            map.put(goal.charAt(i), map.getOrDefault(goal.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> it : map.entrySet()) {
            int freq = it.getValue();
            if(freq == 1) {
                return false;
            }
        }

        return true;
    }
}

public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String goal = scanner.nextLine();
        CheckRotate checkRotate = new CheckRotate();
        System.out.println(checkRotate.rotateString(s, goal));
        scanner.close();
    }
}
