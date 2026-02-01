package Oops;

abstract class Vehicle {
    abstract void start();
    public void fueltype(){
        System.out.println("Vehicle uses fuel");
    }

}

class Car extends Vehicle{

    void start(){
        System.out.println("Car starts with the key");
    }
}
