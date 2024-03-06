public class NoExceptionHandlingExample {

    public static void main(String[] args) {
        // Example without exception handling

        // Division without handling ArithmeticException
        int numerator = 10;
        int denominator = 0;

        // This line will throw an ArithmeticException: / by zero
        int result = numerator / denominator;

        // This line will not be reached if an exception occurs above
        System.out.println("Result: " + result);
    }
}
