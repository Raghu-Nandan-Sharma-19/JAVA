package step1.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter columns : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        System.out.println("Enter " + rows + " * " + cols + " numbers : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing matrix : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
