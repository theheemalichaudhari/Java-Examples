public class DoubleWrapperExample {
    public static void main(String[] args) {
        // Creating a Double object
        Double doubleNum1 = new Double(3.14);
        Double doubleNum2 = new Double("2.71");

        // Converting String to double using parseDouble method
        String strDouble = "1.618";
        double parsedDouble = Double.parseDouble(strDouble);

        // Getting the double value
        double doubleValue = doubleNum1.doubleValue();

        // Multiplying two Double objects
        double product = doubleNum1 * doubleNum2;

        // Displaying results
        System.out.println("Parsed Double: " + parsedDouble);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Product: " + product);
    }
}
