package step1.arrays.basicProblems;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();

        int[] elements = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for(int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int element : elements) {
            if(element > max) {
                max = element;
            }
        }

        System.out.println("Maximum element is : " + max);

        sc.close();
    }
}
