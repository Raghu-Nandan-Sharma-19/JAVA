package basics;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators --> +, -, /, *, %
        int num1 = 5;
        int num2 = 2;

        System.out.println("Arithmetic Operators : ");
        System.out.println("'+' -> " + (num1 + num2));
        System.out.println("'-' -> " + (num1 - num2));
        System.out.println("'/' -> " + ((double) num1 / num2));
        System.out.println("'*' -> " + (num1 * num2));
        System.out.println("'%' -> " + (num1 % num2));
        System.out.println();

        // Unary Operators --> +, -, ++, --, !
        System.out.println("Unary Operators : ");
        System.out.println("'+' ->" + num1);
        System.out.println("'-' -> " + (-num1));
        System.out.println("'++num1' -> " + (++num1));
        System.out.println("'num1++' -> " +  (num1++));
        System.out.println("'--num2' -> " + (--num2));
        System.out.println("'num2--' -> " + (num2--));
        boolean flag = true;
        System.out.println("'!' -> " + (!flag));
        System.out.println();

        // Relational operators
        num1 = 5;
        num2 = 2;
        System.out.println("Relational Operators : ");
        System.out.println("num1 -> " + num1 + "\nnum2 -> " + num2);
        System.out.println("'==' -> " + (num1 == num2));
        System.out.println("'!=' -> " + (num1 != num2));
        System.out.println("'>' -> " + (num1 > num2));
        System.out.println("'<' -> " + (num1 < num2));
        System.out.println("'>=' -> " + (num1 >= num2));
        System.out.println("'<=' -> " + (num1 <= num1));
        System.out.println();
        
        // Logical operators
        boolean first = true;
        boolean second = false;
        System.out.println("Logical Operators : ");
        System.out.println("'&&' -> " + (first && second));
        System.out.println("'||' -> " + (first || second));
        System.out.println();

        // Ternary operator
        num1 = 5;
        num2 = 2;
        System.out.println("Ternary operator: ");
        int num3 = 0;
        System.out.println("num3 before ternary operator: " + num3);
        num3 = num1 > num2 ? num1 : num2;
        System.out.println("num3 after ternary operator: " + num3);
    }
}
