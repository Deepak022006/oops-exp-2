// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class - Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Derived class - Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class to test inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        
        // Single Inheritance Example
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.sound(); // inherited from Animal
        d.bark();  // own method
        
        // Multilevel Inheritance Example
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.sound(); // from Animal
        p.bark();  // from Dog
        p.weep();  // own method
    }
}
