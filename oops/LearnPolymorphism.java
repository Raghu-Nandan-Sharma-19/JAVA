package oops;

class Vehicle {
    private String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk() {
        System.out.println("Honk!!!!!");
    }

    public void printVehicleNumber() {
        System.out.println(numberOfVehicle);
    }
}

class Car extends Vehicle {
    public Car(String numberOfVehicle) {
        super(numberOfVehicle);
    }

    @Override
    public void honk() {
        System.out.println("Give me way");
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        Car car = new Car("JK02CH5969");
        car.printVehicleNumber();
        car.honk();
    }
}
