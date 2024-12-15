package basicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GetDivisors {
    public ArrayList<Integer> getAllDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for(int i = 1; i * i <= num; i++) {
            if(num % i == 0) divisors.add(i);
            if(i != (num / i)) divisors.add(num / i);
        }

        return divisors;
    }
}

public class PrintAllDivisorsOfANumber {
    public static void print(ArrayList<Integer> divisors) {
        Collections.sort(divisors);
        for(Integer divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        GetDivisors getDivisors = new GetDivisors();
        ArrayList<Integer> divisors = getDivisors.getAllDivisors(num);
        print(divisors);
        scanner.close();
    }
}
