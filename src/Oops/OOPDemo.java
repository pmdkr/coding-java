package Oops;

public class OOPDemo {
    public static void main(String[] args) {

        //Encapsolution
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Pramod");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());

        System.out.println("----------------------");

        //abstraction
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.fueltype();

        System.out.println("-------------------");


        //Inheritacne

        Animal animal = new Dog();

        animal.sound();

        System.out.println("--------------");

        //Polymorphism

        Shape shape = new Circle();
        shape.draw();


    }
}
