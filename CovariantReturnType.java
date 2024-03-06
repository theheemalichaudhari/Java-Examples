// CovariantReturnType class demonstrating covariant return types
class Parent {
    Parent get() {
        return this;
    }
}

class Child extends Parent {
    @Override
    Child get() {
        return this;
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.get());
    }
}
