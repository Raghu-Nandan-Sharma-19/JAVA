package oops;

interface Animal {
    void bark();
    default void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class LearnInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
    }
}
