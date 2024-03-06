public class FinalVariableExample {
    // Class-level final variable
    static final double PI = 3.14;

    public static void main(String[] args) {
        // Method-level final variable
        final int MAX_VALUE = 100;

        System.out.println("Value of PI: " + PI);
        System.out.println("Max Value: " + MAX_VALUE);

        // Attempting to change the value of final variable will result in a compilation error
        // Uncommenting the line below will result in an error
        // MAX_VALUE = 200;
    }

    public void displayConstants() {
        // Accessing class-level final variable
        System.out.println("Class-level Constant (PI): " + PI);
    }
}
