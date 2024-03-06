public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit casting (Widening)
        int intValue = 50;
        long longValue = intValue; // Implicit casting from int to long
        float floatValue = longValue; // Implicit casting from long to float
        double doubleValue = floatValue; // Implicit casting from float to double

        System.out.println("Implicit Casting:");
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        // Explicit casting (Narrowing)
        double bigDouble = 123.456;
        float smallFloat = (float) bigDouble; // Explicit casting from double to float
        long bigLong = (long) smallFloat; // Explicit casting from float to long
        int smallInt = (int) bigLong; // Explicit casting from long to int

        System.out.println("\nExplicit Casting:");
        System.out.println("Double Value: " + bigDouble);
        System.out.println("Float Value: " + smallFloat);
        System.out.println("Long Value: " + bigLong);
        System.out.println("Int Value: " + smallInt);
    }
}
