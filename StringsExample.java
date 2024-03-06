public class StringsExample {
    public static void main(String[] args) {
        // String Length
        String greeting = "Hello, World!";
        int length = greeting.length();
        System.out.println("String Length: " + length);

        // More String Methods: toUpperCase() and toLowerCase()
        String message = "Java Programming";
        String upperCaseMessage = message.toUpperCase();
        String lowerCaseMessage = message.toLowerCase();

        System.out.println("\nString Methods:");
        System.out.println("Original Message: " + message);
        System.out.println("Uppercase Message: " + upperCaseMessage);
        System.out.println("Lowercase Message: " + lowerCaseMessage);

        // Finding a Character in a String
        char charToFind = 'a';
        int indexOfChar = message.indexOf(charToFind);

        System.out.println("\nFinding a Character:");
        System.out.println("Index of '" + charToFind + "': " + indexOfChar);

        // Java String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println("\nString Concatenation:");
        System.out.println("Full Name: " + fullName);

        // Java Numbers and Strings
        int number = 42;
        String numberAsString = Integer.toString(number);
        String concatenatedString = "The number is " + numberAsString;

        System.out.println("\nNumbers and Strings:");
        System.out.println("Number as String: " + numberAsString);
        System.out.println("Concatenated String: " + concatenatedString);

        // Java Special Characters
        String specialCharacters = "Escape characters: \nNewline\tTab\bBackspace\rCarriage Return";
        System.out.println("\nSpecial Characters:");
        System.out.println(specialCharacters);
    }
}
