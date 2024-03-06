public class TernaryOperatorExample {
    public static void main(String[] args) {
        // Example using ternary operator
        int number = 15;

        // If the number is even, assign "Even" to result; otherwise, assign "Odd"
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number: " + number);
        System.out.println("Result: " + result);

        // Example with multiple expressions
        int x = 10, y = 20;

        // Compare x and y and assign the larger value to max
        int max = (x > y) ? x : y;

        System.out.println("\nComparison using ternary operator:");
        System.out.println("Max value: " + max);
    }
}
