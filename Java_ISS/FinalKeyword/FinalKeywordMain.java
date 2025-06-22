package FinalKeyword;

/**
 * Main class to demonstrate final keyword usage
 */
public class FinalKeywordMain {
    public static void main(String[] args) {
        System.out.println("JAVA FINAL KEYWORD DEMONSTRATION");
        System.out.println("=================================");

        // Create student object
        FinalKeywordDemo student = new FinalKeywordDemo("STU001", "Alice Johnson");

        // Demonstrate different types of final usage
        student.demonstrateFinalLocalVariables();
        student.demonstrateFinalInstanceVariables();
        FinalKeywordDemo.demonstrateFinalStaticVariables();
        student.displayStudentInfo();

        System.out.println("\n" + "=".repeat(50));

        // Demonstrate final class usage
        System.out.println("\n=== Final Class Demo ===");
        System.out.println("Golden Ratio: " + MathUtility.GOLDEN_RATIO);
        System.out.println("Square of 5: " + MathUtility.square(5));
        System.out.println("Cube of 3: " + MathUtility.cube(3));

        System.out.println("\n" + "=".repeat(50));

        // Demonstrate final method inheritance
        System.out.println("\n=== Final Method Inheritance Demo ===");
        Car car = new Car("Toyota", 4);
        car.startEngine();    // Final method from parent
        car.displayInfo();    // Overridden method
    }
}