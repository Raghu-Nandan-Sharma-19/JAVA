package oops;

class Vehicle {
    private String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void printVehicleNumber() {
        System.out.println(numberOfVehicle);
    }

    public void honk() {
        System.out.println("Honk!!!!");
    }
}

class Car extends Vehicle {
    public Car(String numberOfCar) {
        super(numberOfCar);
    }
}

class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

public class LearnInheritence {
    public static void main(String[] args) {
        Car car = new Car("JK02CH5969");
        car.printVehicleNumber();
        car.honk();

        Bus bus = new Bus("JK02HC5969");
        bus.printVehicleNumber();
    }
}
