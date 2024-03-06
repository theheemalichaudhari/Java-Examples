// EncapsulationExample.java
class Student {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student();

        // Setting private fields using public setter methods
        student.setName("John Doe");
        student.setAge(20);

        // Accessing private fields using public getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
