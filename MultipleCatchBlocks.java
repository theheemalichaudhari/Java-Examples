import java.io.IOException;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5) {
                throw new NullPointerException("Simulating a NullPointerException");
            } else {
                throw new IOException("Simulating an IOException");
            }
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
