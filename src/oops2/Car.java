package oops2;

public class Car extends Vehicle {
    String color;

    void start() {
        super.start();
        System.out.println(this);
        System.out.println(this.model + " car is starting");
    }

    // Constructor of Car class
    Car() {
        super(4);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.wheelsCount = 4;
        car1.model = "Beamer";
        car1.color = "Black";
        car1.start();
    }
}
