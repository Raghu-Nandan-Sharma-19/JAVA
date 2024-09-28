package oops1;

public class LearnConstructors {
    public static void main(String[] args) {
        Complex1 num1 = new Complex1(2, 4);
        Complex1 num2 = new Complex1(4, 1);
        num1.print();
        num2.print();
        System.out.println("Adding two numbers");
        Complex1 result = num1.add(num2);
        result.print();
    }
}

class Complex1 {
    int a, b;

//    // default constructor
//    public Complex1() {
//        a = 5;
//        b = 9;
//        System.out.println("Creating a new object");
//    }
    public Complex1(int real) {
        a = real;
        b = 12;
    }

    // using this keyword
    public Complex1(int a, int b) {
        this.a = a;
        this.b = a;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex1 add(Complex1 num2) {
        return new Complex1(a + num2.a, b + num2.b);
    }
}
