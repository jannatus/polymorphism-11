class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine starts");
    }
    void stopEngine() {
        System.out.println("Vehicle engine stops");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starts with a key");
    }
    void stopEngine() {
        System.out.println("Car engine stops with a key turn");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine starts with a button");
    }
    void stopEngine() {
        System.out.println("Motorcycle engine stops with a switch");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.startEngine();
        v.stopEngine();

        v = new Motorcycle();
        v.startEngine();
        v.stopEngine();
    }
}
