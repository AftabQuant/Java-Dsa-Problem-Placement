package ObjectOrientedProgramming.RevisionSet1;


abstract class Plane {
    abstract void fly();
    abstract void land();
}

class PassengerPlane extends Plane{
    void fly() {
        System.out.println("Passenger-Plane is flying...");
    }

    void land() {
        System.out.println("Passenger-Plane is landing...");
        System.out.println();
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo-Plane is flying...");
    }

    void land() {
        System.out.println("Cargo-Plane is landing...");
        System.out.println();
    }
}


public class AbstractClass {
    static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.land();

        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.land();

    }
}
