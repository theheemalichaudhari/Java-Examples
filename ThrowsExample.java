public class ThrowsExample {

    public static void main(String[] args) {
        try {
            performDivision();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void performDivision() throws ArithmeticException {
        // Example with throws keyword

        // Division without handling ArithmeticException
        int numerator = 10;
        int denominator = 0;

        // This line will throw an ArithmeticException: / by zero
        int result = numerator / denominator;

        // This line will not be reached if an exception occurs above
        System.out.println("Result: " + result);
    }
}
