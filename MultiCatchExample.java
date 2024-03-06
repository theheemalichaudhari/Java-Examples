// MultiCatchExample.java
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | NullPointerException e) {
            // Handling multiple exceptions in a single catch block (multicatch)
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
