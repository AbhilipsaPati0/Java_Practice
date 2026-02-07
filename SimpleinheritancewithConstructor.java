/*
 * Program Name- Creating  a Java program to demonstrate inheritance with method overriding and constructor.
 * Name- abhilipsa Pati
 * Regn No- 230301120502
 * Date-09.09.2023
 */
// Define the base class Vehicle with a constructor and a method
class Vehicle {
    // Constructor to initialize the brand
    public Vehicle(String brand) {
        System.out.println("Base class Vehicle constructor called");
        System.out.println("Brand: " + brand);
    }

    // Method to be overridden by derived classes
    public void honk() {
        System.out.println("The vehicle honks.");
    }
}
// Define the derived class Car that overrides the honk() method
class Car extends Vehicle {
    // Constructor to initialize the brand and model
    public Car(String brand, String model) {
        super(brand); // Call the constructor of the base class
        System.out.println("Derived class Car constructor called");
        System.out.println("Model: " + model);
    }

    // Override the honk() method to provide specific implementation for Car
    @Override  //anotation
    public void honk() {
        System.out.println("The car beeps.");
    }
}
// Define the derived class Bike that overrides the honk() method
class Bike extends Vehicle {
    // Constructor to initialize the brand and model
    public Bike(String brand, String model) {
        super(brand); // Call the constructor of the base class
        System.out.println("Derived class Bike constructor called");
        System.out.println("Model: " + model);
    }
    // Override the honk() method to provide specific implementation for Bike.

    @Override
    public void honk() {
        System.out.println("The bike beeps loudly.");
    }
}
// Test class to demonstrate method overriding
public class SimpleinheritancewithConstructor {
    public static void main(String[] args) {
        // Create objects of Car and Bike
        Car car = new Car("Toyota", "BMW");
        Bike bike = new Bike("Honda", "CBR");

        // Call the honk() method on each object
        System.out.println("\nCalling honk() method:");
        car.honk();
        bike.honk();
    }
}