public class MathExample {
    public static void main(String[] args) {
        // Math.max(x, y) - Returns the maximum of two numbers
        int maxResult = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20: " + maxResult);

        // Math.min(x, y) - Returns the minimum of two numbers
        int minResult = Math.min(10, 20);
        System.out.println("Minimum of 10 and 20: " + minResult);

        // Math.sqrt(x) - Returns the square root of a number
        double sqrtResult = Math.sqrt(25.0);
        System.out.println("Square root of 25: " + sqrtResult);

        // Math.abs(x) - Returns the absolute value of a number
        int absResult1 = Math.abs(-15);
        double absResult2 = Math.abs(-7.5);
        System.out.println("Absolute value of -15: " + absResult1);
        System.out.println("Absolute value of -7.5: " + absResult2);

        // Random Numbers
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomInt = (int) (Math.random() * 100);
        System.out.println("\nRandom Number between 0 and 100: " + randomInt);

        // Generate a random double between 0 (inclusive) and 1 (exclusive)
        double randomDouble = Math.random();
        System.out.println("Random Double between 0 and 1: " + randomDouble);
    }
}
