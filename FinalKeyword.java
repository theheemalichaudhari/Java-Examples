// FinalKeyword class demonstrating the use of final keyword
public class FinalKeyword {
    final int value = 10; // Final variable

    // Final method
    final void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
    }
}
