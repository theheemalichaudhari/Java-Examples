// IdentifierExample.java
public class IdentifierExample {
    public static void main(String[] args) {
        // Variable declarations and assignments
        int age = 25;
        double salary = 50000.50;
        String employeeName = "Heemali";

        // Method call
        displayEmployeeInfo(age, salary, employeeName);

        // Constant declaration
        final double PI = 3.14;

        // Using constant in a calculation
        double circleArea = calculateCircleArea(5.0, PI);
        System.out.println("Circle Area: " + circleArea);
    }

    // Method with valid identifier names
    static void displayEmployeeInfo(int empAge, double empSalary, String empName) {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Salary: " + empSalary);
    }

    // Method with valid identifier names
    static double calculateCircleArea(double radius, final double piValue) {
        return piValue * radius * radius;
    }
}
