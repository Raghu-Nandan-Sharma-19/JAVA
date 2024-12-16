package basicArrays;

import java.util.Scanner;

class ReverseArray {
    private void display(int[] numbers, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private void swap(int[] numbers, int start, int end) {
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
    }

    public void reverse(int[] numbers, int size) {
        int start = 0, end = size - 1;
        
        while(start < end) {
            swap(numbers, start, end);
            start++;
            end--;
        }

        display(numbers, size);
    }
}

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        for(int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(numbers, size);

        scanner.close();
    }
}
