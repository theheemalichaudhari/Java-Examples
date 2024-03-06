public class CharacterExample {
    public static void main(String[] args) {
        // Char data type
        char grade = 'A'; // Single character enclosed in single quotes

        // Unicode representation of characters
        char unicodeChar = '\u03A9'; // Greek capital letter omega

        // Escape sequences
        char tab = '\t'; // Tab character
        char newline = '\n'; // Newline character

        // Displaying characters
        System.out.println("Grade: " + grade);
        System.out.println("Unicode Character: " + unicodeChar);
        System.out.println("Tab Character: " + tab + "This is after tab.");
        System.out.println("Newline Character: This is before newline." + newline + "This is after newline.");
    }
}
