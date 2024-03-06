public class WhileDoWhileExample {
    public static void main(String[] args) {
        // While Loop Example
        int countWhile = 5;

        System.out.println("While Loop Example:");
        while (countWhile > 0) {
            System.out.println("Countdown: " + countWhile);
            countWhile--; // Decrement count
        }

        // Do/While Loop Example
        int countDoWhile = 5;

        System.out.println("\nDo/While Loop Example:");
        do {
            System.out.println("Countdown: " + countDoWhile);
            countDoWhile--; // Decrement count
        } while (countDoWhile > 0);
    }
}
