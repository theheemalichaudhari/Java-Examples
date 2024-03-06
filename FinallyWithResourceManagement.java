import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyWithResourceManagement {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            // Read from the file
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            // Close the resources in the finally block
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
