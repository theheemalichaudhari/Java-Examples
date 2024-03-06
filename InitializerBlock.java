// InitializerBlock class demonstrating instance initializer block
public class InitializerBlock {
    // Instance initializer block
    {
        System.out.println("Instance Initializer Block executed");
    }

    public InitializerBlock() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        InitializerBlock obj = new InitializerBlock();
    }
}
