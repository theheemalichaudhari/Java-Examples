// ArraysLoopExample.java
public class ArraysLoopExample {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop Through an Array with For-Each
        System.out.println("Loop Through an Array with For-Each:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to the next line

        // Enhanced For Loop with String Array
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};

        System.out.println("\nEnhanced For Loop with String Array:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Enhanced For Loop with Double Array
        double[] prices = {2.99, 1.99, 3.49, 0.99};

        System.out.println("\nEnhanced For Loop with Double Array:");
        for (double price : prices) {
            System.out.println("Price: $" + price);
        }
    }
}
