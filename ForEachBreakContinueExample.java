public class ForEachBreakContinueExample {
    public static void main(String[] args) {
        // For Each Loop Example
        System.out.println("For Each Loop Example:");
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to the next line

        // Break and Continue in For Loop Example
        System.out.println("\nBreak and Continue in For Loop Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encountered 5, breaking out of the loop.");
                break; // Exit the loop when i is 5
            }

            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // Skip the rest of the loop body for even numbers
            }

            System.out.println("Current value of i: " + i);
        }

        // Break and Continue in While Loop Example
        System.out.println("\nBreak and Continue in While Loop Example:");
        int j = 1;
        while (j <= 10) {
            if (j == 7) {
                System.out.println("Encountered 7, breaking out of the loop.");
                break; // Exit the loop when j is 7
            }

            if (j % 3 == 0) {
                System.out.println("Skipping multiple of 3: " + j);
                j++;
                continue; // Skip the rest of the loop body for multiples of 3
            }

            System.out.println("Current value of j: " + j);
            j++;
        }
    }
}
