// FinallyBlockExample.java
public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling specific exception
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            // Code to be executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed");
        }
    }
}
