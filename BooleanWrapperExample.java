public class BooleanWrapperExample {
    public static void main(String[] args) {
        // Creating a Boolean object
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean("false");

        // Converting String to boolean using parseBoolean method
        String strBool = "true";
        boolean parsedBool = Boolean.parseBoolean(strBool);

        // Getting the boolean value
        boolean boolValue = bool1.booleanValue();

        // Using logical AND operator with Boolean objects
        boolean result = bool1 && bool2;

        // Displaying results
        System.out.println("Parsed Boolean: " + parsedBool);
        System.out.println("Boolean Value: " + boolValue);
        System.out.println("Logical AND Result: " + result);
    }
}
