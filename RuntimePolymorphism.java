// RuntimePolymorphism class demonstrating runtime polymorphism and dynamic binding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference of Animal type but object of Dog type
        animal.sound(); // Dynamic binding at runtime
    }
}
