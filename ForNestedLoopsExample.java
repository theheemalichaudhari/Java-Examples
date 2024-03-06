public class ForNestedLoopsExample {
    public static void main(String[] args) {
        // For Loop Example
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Nested Loops Example (Print right-angled triangle pattern)
        System.out.println("\nNested Loops Example (Right-Angled Triangle Pattern):");
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Inner loop to print '*' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
