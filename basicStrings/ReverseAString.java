import java.util.Scanner;
import java.util.Vector;

class ReverseString {
    private void print(Vector<Character> s) {
        for(int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }

    public void reverse(Vector<Character> s) {
        int start = 0, end = s.size() - 1;
        
        while(start < end) {
            char temp = s.get(start);
            s.set(start, s.get(end));
            s.set(end, temp);
            start++;
            end--;
        }

        print(s);
    }
}

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vector<Character> s = new Vector<>();
        
        for(int i = 0; i < n; i++) {
            char element = scanner.next().charAt(0);
            s.add(element);
        }

        ReverseString reverseString = new ReverseString();
        reverseString.reverse(s);

        scanner.close();
    }
}
