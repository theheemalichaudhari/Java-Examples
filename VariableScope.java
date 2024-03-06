public class VariableScope {
    // Class-level variable
    static int globalVar = 50;

    public static void main(String[] args) {
        // Method-level variable
        int localVar = 10;

        // Accessing variables
        System.out.println("Local variable: " + localVar);
        System.out.println("Global variable: " + globalVar);

        // Calling another method
        displayValues();
    }

    public static void displayValues() {
        // Accessing class-level variable
        System.out.println("Global variable inside method: " + globalVar);
    }
}
