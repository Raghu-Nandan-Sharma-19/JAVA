import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SortByFrequency {
    public List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];

        for (int i = 0; i < 26; i++) {
            freq[i] = new Pair(0, (char)(i+'a'));
        }

        for (char ch : s.toCharArray()) {
            freq[ch-'a'].freq++;
        }

        Arrays.sort(freq, (p1, p2) -> {
            if(p1.freq != p2.freq) return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();
        for (Pair p : freq) {
            if(p.freq > 0) result.add(p.ch);
        }

        return result;
    }

    class Pair {
        int freq;
        char ch;
        Pair (int f, char c) {
            this.freq = f;
            this.ch = c;
        }
    }
}

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SortByFrequency sortByFrequency = new SortByFrequency();
        List<Character> result = sortByFrequency.frequencySort(s);
        
        for (var it : result) {
            System.out.print(it + " ");
        }
        System.out.println();

        scanner.close();
    }
}
