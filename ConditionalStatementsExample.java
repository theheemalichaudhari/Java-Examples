public class ConditionalStatementsExample {
    public static void main(String[] args) {
        // Example using if statement
        int number = 25;

        System.out.println("Example using if statement:");
        if (number > 0) {
            System.out.println("Number is positive.");
        }

        // Example using if-else statement
        int score = 75;

        System.out.println("\nExample using if-else statement:");
        if (score >= 70) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Sorry, you did not pass.");
        }

        // Example using if-else if-else statement
        int marks = 85;

        System.out.println("\nExample using if-else if-else statement:");
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // Example using switch statement
        char grade = 'B';

        System.out.println("\nExample using switch statement:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Acceptable.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
