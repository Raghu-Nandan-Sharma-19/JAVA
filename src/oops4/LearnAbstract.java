package oops4;

import java.util.Scanner;

public class LearnAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Enter model of the car : ");
        car.model = sc.nextLine();
        car.accelerate(car.model);
        car.brake(car.model);
        car.honks(car.model);
        sc.close();
    }
}

abstract class Vehicle {
    abstract void accelerate(String model);
    abstract void brake(String model);
    abstract void honks(String model);
}

class Car extends Vehicle {
    String model;

    @Override
    void accelerate(String model) {
        this.model = model;
        System.out.println(model + " is accelerating");
    }

    @Override
    void brake(String model) {
        this.model = model;
        System.out.println(model + " is braking");
    }

    @Override
    void honks(String model) {
        this.model = model;
        System.out.println(model + " is honking");
    }
}