package oops;

class Test {
    public void printTest() {
        System.out.println("Hello!");
    }

    int age;
    public void assignAge(int num) {
        age = num;
    }
}

public class LearnClassesAndObjects {
    public static void main(String[] args) {
        Test test = new Test();
        test.printTest();
        test.assignAge(10);

        Test test2 = new Test();
        test2.assignAge(20);

        System.out.println(test.age);

        System.out.println(test2.age);
    }
}
