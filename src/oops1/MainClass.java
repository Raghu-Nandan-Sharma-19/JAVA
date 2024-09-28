package oops1;

public class MainClass {
    public static void main(String[] args) {
        // Object of dog class
        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.bark();
        dog1.walk();

        Dog dog2 = new Dog();
        dog2.name = "Leo";
        dog2.walk();
    }
}

class Dog {   // blueprint of dog
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name + " is walking");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

class Cat {

}
