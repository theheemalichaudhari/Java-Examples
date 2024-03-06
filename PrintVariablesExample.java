// CombinedVariablesExample.java
public class PrintVariablesExample {
    public static void main(String[] args) {
        // Primitive data types
        int age = 22;
        double height = 5.2;
        boolean isStudent = true;

        // Reference data type (String)
        String name = "Heemali";

        // Print variables using System.out.println
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student? " + isStudent);
        System.out.println("Name: " + name);

        // Use System.out.printf for formatted output
        System.out.printf("Person: %s, Age: %d, Height: %.2f%n", name, age, height);

        // Concatenate variables in a string
        String info = "Person: " + name + ", Age: " + age + ", Height: " + height;
        System.out.println(info);

        // Variable updates
        age = 26;
        height = 6.0;
        isStudent = false;

        // Updated values
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Height: " + height);
        System.out.println("Is Student Now? " + isStudent);

        // Arithmetic operations
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Using System.out.print for inline printing
        System.out.print("Num1: " + num1);
        System.out.print(", Num2: " + num2);
        System.out.println(", Sum: " + sum);
    }
}
