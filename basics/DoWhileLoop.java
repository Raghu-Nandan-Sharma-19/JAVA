package basics;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        do {
            num = scanner.nextInt();
            System.out.println(num);
        } while (num != 10);

        scanner.close();
    }
}
