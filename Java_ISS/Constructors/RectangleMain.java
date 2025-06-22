package Constructors;

public class RectangleMain{
    public static void main(String[] args) {
        System.out.println("=== Rectangle Constructors Demo ===");

        // Default constructor
        System.out.println("\n--- Default Constructor ---");
        Rectangle unitSquare = new Rectangle();
        unitSquare.displayInfo();

        // Constructor with length and width
        System.out.println("\n--- Constructor with Length and Width ---");
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        rect1.displayInfo();

        // Constructor with length, width, and color
        System.out.println("\n--- Constructor with Length, Width, and Color ---");
        Rectangle rect2 = new Rectangle(7.0, 3.0, "Blue");
        rect2.displayInfo();

        // Copy constructor
        System.out.println("\n--- Copy Constructor ---");
        Rectangle rect3 = new Rectangle(rect2);
        rect3.displayInfo();

        // Modify the original and show the copy is independent
        rect2.setColor("Red");
        System.out.println("\n--- After Modifying Original ---");
        System.out.println("Original Rectangle:");
        rect2.displayInfo();
        System.out.println("Copied Rectangle:");
        rect3.displayInfo();
    }
}