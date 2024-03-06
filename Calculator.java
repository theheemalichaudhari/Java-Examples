// Calculator class demonstrating method overloading and overriding
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Overriding toString() method from Object class
    @Override
    public String toString() {
        return "This is a Calculator object";
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Method Overloading
        System.out.println("Sum (int): " + calc.add(5, 10));
        System.out.println("Sum (double): " + calc.add(5.5, 10.5));

        // Overriding toString()
        System.out.println(calc); // Calls overridden toString() method
    }
}
