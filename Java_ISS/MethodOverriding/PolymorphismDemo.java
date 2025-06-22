package MethodOverriding;



import java.util.ArrayList;

/**
 * Main class demonstrating all types of polymorphism
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        System.out.println("=== JAVA POLYMORPHISM DEMONSTRATION ===");

        // Runtime Polymorphism Demo
        demonstrateRuntimePolymorphism();

        // Interface Polymorphism Demo
        demonstrateInterfacePolymorphism();

        // Compile-time Polymorphism Demo
        demonstrateCompileTimePolymorphism();


    }

    /**
     * Demonstrates runtime polymorphism with method overriding
     */
    public static void demonstrateRuntimePolymorphism() {
        System.out.println("\n=== Runtime Polymorphism (Method Overriding) ===");

        // Polymorphic array
        Shape[] shapes = {
                new Circle("Red", 5.0),
                new Rectangle("Blue", 4.0, 6.0),
                new Triangle("Green", 3.0, 4.0, 5.0)
        };

        // Polymorphic method calls
        for (Shape shape : shapes) {
            shape.displayInfo(); // Calls overridden method
            System.out.println();
        }

        // Polymorphic method parameters
        System.out.println("--- Shape Comparison ---");
        Shape circle = new Circle("Yellow", 3.0);
        Shape rectangle = new Rectangle("Purple", 5.0, 4.0);
        circle.compareArea(rectangle);
    }

    /**
     * Demonstrates interface-based polymorphism
     */
    public static void demonstrateInterfacePolymorphism() {
        System.out.println("\n=== Interface-based Polymorphism ===");

        // Polymorphic array with interface reference
        Drawable[] drawables = {
                new GraphicObject("Circle", 10, 20),
                new GraphicObject("Square", 30, 40),
                new Button("OK"),
                new Button("Cancel")
        };

        // Polymorphic method calls
        for (Drawable drawable : drawables) {
            drawable.draw();
            drawable.erase();
        }

        // Multiple interface implementation
        System.out.println("\n--- Multiple Interface Implementation ---");
        GraphicObject obj = new GraphicObject("Triangle", 0, 0);
        obj.draw();         // From Drawable
        obj.move(50, 60);   // From Movable
        obj.getPosition();  // From Movable
    }

    /**
     * Demonstrates compile-time polymorphism (method overloading)
     */
    public static void demonstrateCompileTimePolymorphism() {
        System.out.println("\n=== Compile-time Polymorphism (Method Overloading) ===");

        Calculator calc = new Calculator();

        // Method overloading examples
        System.out.println("Result: " + calc.add(5, 3));
        System.out.println("Result: " + calc.add(2.5, 3.7));
        System.out.println("Result: " + calc.add(1, 2, 3));
        System.out.println("Result: " + calc.add("Hello", "World"));
        System.out.println("Result: " + calc.add(new int[]{1, 2, 3, 4, 5}));

        // Constructor overloading
        System.out.println("\n--- Constructor Overloading ---");
        Student student1 = new Student("Alice");
        student1.displayInfo();

        System.out.println();
        Student student2 = new Student("Bob", 20, "Computer Science", 3.8);
        student2.displayInfo();
    }

    /**
     * Demonstrates polymorphism with collections
     */




}