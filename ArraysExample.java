// ArraysExample.java
public class ArraysExample {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access the Elements of an Array
        System.out.println("Access the Elements of an Array:");
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);

        // Change an Array Element
        System.out.println("\nChange an Array Element:");
        System.out.println("Before change - Element at index 1: " + numbers[1]);
        numbers[1] = 10; // Change the value at index 1
        System.out.println("After change - Element at index 1: " + numbers[1]);

        // Array Length
        System.out.println("\nArray Length:");
        int arrayLength = numbers.length;
        System.out.println("Length of the array: " + arrayLength);

        // Iterating through the Array
        System.out.println("\nIterating through the Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
