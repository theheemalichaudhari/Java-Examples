public class BooleansExample {
    public static void main(String[] args) {
        // Boolean Values
        boolean isJavaFun = true;
        boolean isCodingHard = false;

        System.out.println("Boolean Values:");
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Coding Hard? " + isCodingHard);

        // Boolean Expression
        int x = 10, y = 20;

        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreaterThan = (x > y);
        boolean isLessThan = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("\nBoolean Expressions:");
        System.out.println("Is Equal? " + isEqual);
        System.out.println("Is Not Equal? " + isNotEqual);
        System.out.println("Is Greater Than? " + isGreaterThan);
        System.out.println("Is Less Than? " + isLessThan);
        System.out.println("Is Greater or Equal? " + isGreaterOrEqual);
        System.out.println("Is Less or Equal? " + isLessOrEqual);

        // Logical AND, OR, NOT
        boolean condition1 = true, condition2 = false;

        boolean logicalAnd = condition1 && condition2;
        boolean logicalOr = condition1 || condition2;
        boolean logicalNot1 = !condition1;
        boolean logicalNot2 = !condition2;

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT for condition1: " + logicalNot1);
        System.out.println("Logical NOT for condition2: " + logicalNot2);
    }
}
