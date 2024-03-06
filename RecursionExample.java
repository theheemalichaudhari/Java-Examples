// RecursionExample.java
public class RecursionExample {
    // Recursive method to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calling the recursive method
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
