// A generic class with a type parameter T
class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getValue());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println("Double Value: " + doubleBox.getValue());

        // You can't assign a String to a Box<Integer> due to type safety
        // Box<Integer> invalidBox = new Box<>("Invalid"); // This line will cause a compilation error
    }
}
