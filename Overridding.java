/*
 * Program Name- Creating  a Java program to demonstrate inheritance with method overriding.
 * Name- abhilipsa Pati
 * Regn No- 230301120502
 * Date-09.09.2023
 */
// Define the base class Shape with a method draw()
class Shape {
    // Method to be overridden by derived classes
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Define the derived class Circle that overrides the draw() method
class Circle extends Shape {
    // Override the draw() method to provide specific implementation for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Define the derived class Square that overrides the draw() method
class Square extends Shape {
    // Override the draw() method to provide specific implementation for Square
    // @Override //annotation
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
// Test class to demonstrate inheritance with method overriding
public class Overridding {
    public static void main(String[] args) {
        // Create objects of Shape, Circle, and Square
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        // Call the draw() method on each object
        System.out.println("Drawing shapes:");
        shape.draw();
        circle.draw();
        square.draw();
    }
}