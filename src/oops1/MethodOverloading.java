package oops1;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Novak");
    }
}

class Greet {

    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello " + name + ", Good morning");
    }
}
