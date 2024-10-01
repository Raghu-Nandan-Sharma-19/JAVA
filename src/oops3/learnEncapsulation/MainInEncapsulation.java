package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {
    public static void printHello() {
        System.out.println("Hello");
    }

    public void printHi() {
        System.out.println("Hi");
    }

    static {
        System.out.println("Called from the static block");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(12);
        System.out.println("Age of person is : " + person.getAge());
        Person person1 = new Person();
        person1.setAge(14);
        System.out.println("Age of person 1 is : " + person1.getAge());

        System.out.println("No of persons : " + Person.count);

        MainInEncapsulation.printHello();

        // non-static method call
        MainInEncapsulation main1 = new MainInEncapsulation();
        main1.printHi();
    }
}
