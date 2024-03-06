
// Example class representing a person
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Example enum representing days of the week
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class NonPrimitiveDataTypesExample {
    public static void main(String[] args) {
        // String - a class representing sequences of characters
        String greeting = "Hello!";
        System.out.println("Greeting: " + greeting);

        // Arrays - a collection of elements of the same type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Using the Person class
        Person person1 = new Person("Heemali", 22);
        Person person2 = new Person("Shruti", 24);

        // Displaying person information
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("Person 2:");
        person2.displayInfo();

        // Using the Days enum
        Days today = Days.MONDAY;
        System.out.println("Today is: " + today);
    }
}
