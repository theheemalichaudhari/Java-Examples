public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int num1 = 10, num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Assignment Operators
        int a = 10;
        int b = 5;

        System.out.println("\nAssignment Operators:");
        System.out.println("Initial value of a: " + a);
        a += b; // Equivalent to: a = a + b
        System.out.println("After a += b, a: " + a);
        a -= b; // Equivalent to: a = a - b
        System.out.println("After a -= b, a: " + a);
        a *= b; // Equivalent to: a = a * b
        System.out.println("After a *= b, a: " + a);
        a /= b; // Equivalent to: a = a / b
        System.out.println("After a /= b, a: " + a);
        a %= b; // Equivalent to: a = a % b
        System.out.println("After a %= b, a: " + a);

        // Comparison Operators
        int x = 10, y = 20;
        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreaterThan = (x > y);
        boolean isLessThan = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("\nComparison Operators:");
        System.out.println("Is Equal? " + isEqual);
        System.out.println("Is Not Equal? " + isNotEqual);
        System.out.println("Is Greater Than? " + isGreaterThan);
        System.out.println("Is Less Than? " + isLessThan);
        System.out.println("Is Greater or Equal? " + isGreaterOrEqual);
        System.out.println("Is Less or Equal? " + isLessOrEqual);

        // Logical Operators
        boolean condition1 = true, condition2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT for condition1: " + !condition1);
        System.out.println("Logical NOT for condition2: " + !condition2);
    }
}
