public class FloatWrapperExample {
    public static void main(String[] args) {
        // Creating a Float object
        Float floatNum1 = new Float(3.14f);
        Float floatNum2 = new Float("2.71");

        // Converting String to float using parseFloat method
        String strFloat = "1.618";
        float parsedFloat = Float.parseFloat(strFloat);

        // Getting the float value
        float floatValue = floatNum1.floatValue();

        // Multiplying two Float objects
        float product = floatNum1 * floatNum2;

        // Displaying results
        System.out.println("Parsed Float: " + parsedFloat);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Product: " + product);
    }
}
