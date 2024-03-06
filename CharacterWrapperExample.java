public class CharacterWrapperExample {
    public static void main(String[] args) {
        // Creating a Character object
        Character char1 = new Character('A');
        Character char2 = new Character('Z');

        // Converting char to String using toString method
        String charString = char1.toString();

        // Getting the char value
        char charValue = char2.charValue();

        // Checking if a character is a digit
        boolean isDigit = Character.isDigit(char1);

        // Displaying results
        System.out.println("Char as String: " + charString);
        System.out.println("Char Value: " + charValue);
        System.out.println("Is Digit? " + isDigit);
    }
}
