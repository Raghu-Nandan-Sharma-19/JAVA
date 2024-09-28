package oops1;

public class ComplexNumber {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();
    }
}
class Complex {
    int a, b;

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}
