// Animal class (superclass)
public class Animal {
    public Animal() {
        System.out.println("Animal constructor called");
    }
}

// Mammal class (subclass of Animal)
public class Mammal extends Animal {
    public Mammal() {
        System.out.println("Mammal constructor called");
    }
}

// Dog class (subclass of Mammal)
public class Dog extends Mammal {
    public Dog() {
        System.out.println("Dog constructor called");
    }
}

// Main class to test the constructors
public class hierarchywithConstructor {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}