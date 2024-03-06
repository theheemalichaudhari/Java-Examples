// TryWithResourcesExample.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close resources
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            // Read from the file
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}
