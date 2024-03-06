// OverloadingVsOverridingExample.java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overloading in the subclass
    void makeSound(String sound) {
        System.out.println("Dog barks: " + sound);
    }

    // Method overriding in the subclass
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverloadingVsOverridingExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Calling overloaded method
        myDog.makeSound("Woof");

        // Calling overridden method
        myDog.makeSound();
    }
}
