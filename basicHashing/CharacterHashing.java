package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            char ch = scanner.next().charAt(0);
            System.out.println(ch + " -> " + map.get(ch));
        }

        scanner.close();
    }
}
