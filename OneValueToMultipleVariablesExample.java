public class OneValueToMultipleVariablesExample {
    public static void main(String[] args) {
        // Declare multiple variables of the same type
        int x, y, z;

        // Assign one value to multiple variables
        x = y = z = 10;

        // Print the values of the variables
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);

        // Update one variable and see the effect on others
        x = 20;

        // Print the updated values
        System.out.println("Updated value of x: " + x);
        System.out.println("Value of y after update: " + y);
        System.out.println("Value of z after update: " + z);
    }
}
