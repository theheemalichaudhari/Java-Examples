public class LongWrapperExample {
    public static void main(String[] args) {
        // Creating a Long object
        Long longNum1 = new Long(9876543210L);
        Long longNum2 = new Long("1234567890123456789");

        // Converting String to long using parseLong method
        String strLong = "987654321";
        long parsedLong = Long.parseLong(strLong);

        // Getting the long value
        long longValue = longNum1.longValue();

        // Subtracting two Long objects
        long difference = longNum2 - longNum1;

        // Displaying results
        System.out.println("Parsed Long: " + parsedLong);
        System.out.println("Long Value: " + longValue);
        System.out.println("Difference: " + difference);
    }
}
