public class IntegerWrapperExample {
    public static void main(String[] args) {
        // Creating an Integer object
        Integer num1 = new Integer(42);
        Integer num2 = new Integer("123");

        // Converting String to int using parseInt method
        String strNum = "456";
        int parsedNum = Integer.parseInt(strNum);

        // Getting the int value
        int intValue = num1.intValue();

        // Adding two Integer objects
        int sum = num1 + num2;

        // Displaying results
        System.out.println("Parsed Number: " + parsedNum);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Sum: " + sum);
    }
}
