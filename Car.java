// Car class extending Vehicle and using the super keyword
public class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand); // Calling the parameterized constructor of the superclass using super
        this.model = model;
    }

    // Overriding display method
    @Override
    void display() {
        super.display(); // Calling the display method of the superclass using super
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.display(); // Displaying information about the car
    }
}
