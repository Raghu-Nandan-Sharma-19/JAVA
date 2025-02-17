package basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // for (int i = 0; i < n; i++) {
        //     if (!map.containsKey(arr[i])) {
        //         map.put(arr[i], 1);
        //     } else {
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     }
        // }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int num = scanner.nextInt();
            System.out.println(num + " -> " + map.get(num));
        }

        scanner.close();
    }
}
