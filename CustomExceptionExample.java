class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating a situation where a custom exception is thrown
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.err.println("Caught CustomException: " + e.getMessage());
        }
    }
}
