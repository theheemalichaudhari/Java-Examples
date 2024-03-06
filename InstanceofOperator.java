// InstanceofOperator class demonstrating the use of instanceof operator
class Person {
}

class Employee extends Person {
}

public class InstanceofOperator {
    public static void main(String[] args) {
        Person person = new Employee();

        // Using instanceof to check the type of object
        if (person instanceof Employee) {
            System.out.println("person is an instance of Employee");
        } else {
            System.out.println("person is not an instance of Employee");
        }
    }
}
