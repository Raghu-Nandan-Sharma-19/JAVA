package step1.arrays;

import java.util.Scanner;

public class BasicsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Ist way
//        int[] ages;
//        ages = new int[5];
//        ages[0] = 12;
//        ages[1] = 23;
//        System.out.println(ages[1]);

//        // 2nd way
//        int[] ages = new int[5];
//        ages[0] = 12;
//        System.out.println(ages[0]);

//        // 3rd way
//        int[] marks = {98, 97, 90, 91, 80};
//        System.out.println(marks[2]);
//

        // 4th way -- > user input
        System.out.println("Enter no of children : ");
        int children = sc.nextInt();

        int[] ages = new int[children];
        System.out.println("Enter ages : ");
        for(int i = 0; i < children; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println("Ages of children are :");
        for(int age : ages) {  // for each loop
            System.out.println(age);
        }

        System.out.println("Length : " + ages.length);

        sc.close();
    }
}
