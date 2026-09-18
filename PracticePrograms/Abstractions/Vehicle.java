abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a button");
    }
}

public class vehichle{
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.stop();

        b.start();
        b.stop();
    }
}
