public class MultipleVariablesExample {
    public static void main(String[] args) {
        // Declare and initialize multiple variables in one line
        int num1 = 10, num2 = 5;
        double pi = 3.14, height = 6.0;
        boolean isStudent = true, isWorking = false;

        // Print the values of the variables
        System.out.println("Num1: " + num1 + ", Num2: " + num2);
        System.out.println("Pi: " + pi + ", Height: " + height);
        System.out.println("Is Student? " + isStudent + ", Is Working? " + isWorking);

        // Update some variables
        num1 = 20;
        pi = 3.14159;
        isWorking = true;

        // Print the updated values
        System.out.println("Updated Num1: " + num1);
        System.out.println("Updated Pi: " + pi);
        System.out.println("Is Working Now? " + isWorking);
    }
}
