package oops;

class Vehicle1 {
    private String numberOfVehicle;

    public Vehicle1(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk() {
        System.out.println("Honk!!!!!");
    }

    public void printVehicleNumber() {
        System.out.println(numberOfVehicle);
    }
}

class Car2 extends Vehicle1 {
    public Car2(String numberOfVehicle) {
        super(numberOfVehicle);
    }

    @Override
    public void honk() {
        System.out.println("Give me way");
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        Car2 car = new Car2("JK02CH5969");
        car.printVehicleNumber();
        car.honk();
    }
}
