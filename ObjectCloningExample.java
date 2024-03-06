// ObjectCloningExample.java
class MyClass implements Cloneable {
    int data;

    // Constructor
    public MyClass(int data) {
        this.data = data;
    }

    // Overriding clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloningExample {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass original = new MyClass(42);

        try {
            // Cloning the object
            MyClass cloned = (MyClass) original.clone();

            // Displaying data of original and cloned objects
            System.out.println("Original Object Data: " + original.data);
            System.out.println("Cloned Object Data: " + cloned.data);
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported: " + e.getMessage());
        }
    }
}
