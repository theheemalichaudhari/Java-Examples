public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        // Integer Types
        byte smallNumber = 127;      // 8-bit signed integer
        short shortNumber = 32767;   // 16-bit signed integer
        int integerNumber = 2147483647; // 32-bit signed integer
        long longNumber = 9223372036854775807L; // 64-bit signed integer

        // Floating Point Types
        float floatValue = 123.45f;   // 32-bit floating point
        double doubleValue = 9876.54321; // 64-bit floating point

        // Boolean Data Type
        boolean isJavaFun = true;
        boolean isCodingHard = false;

        // Printing values
        System.out.println("Byte Value: " + smallNumber);
        System.out.println("Short Value: " + shortNumber);
        System.out.println("Integer Value: " + integerNumber);
        System.out.println("Long Value: " + longNumber);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Java is Fun? " + isJavaFun);
        System.out.println("Is Coding Hard? " + isCodingHard);

        // Scientific Numbers
        double scientificNumber = 3.0e8; // 3.0 x 10^8
        System.out.println("Scientific Number: " + scientificNumber);
    }
}
