package Constructors;

/**
 * Demonstrates constructors with a Rectangle class
 */
public class Rectangle {

    // Instance variables
    private double length;
    private double width;
    private String color;

    /**
     * Default constructor: creates a unit square (1x1)
     */
    public Rectangle() {
        System.out.println("Default constructor called: Creating a unit square");
        this.length = 1.0;
        this.width = 1.0;
        this.color = "White";
    }

    /**
     * Constructor with length and width
     */
    public Rectangle(double length, double width) {
        System.out.println("Constructor with length and width called");
        this.length = length;
        this.width = width;
        this.color = "White"; // Default color
    }

    /**
     * Constructor with length, width, and color
     */
    public Rectangle(double length, double width, String color) {
        System.out.println("Constructor with length, width, and color called");
        this.length = length;
        this.width = width;
        this.color = color;
    }

    /**
     * Copy constructor
     */
    public Rectangle(Rectangle other) {
        System.out.println("Copy constructor called");
        this.length = other.length;
        this.width = other.width;
        this.color = other.color;
    }

    /**
     * Method to calculate area
     */
    public double calculateArea() {
        return length * width;
    }

    /**
     * Method to display rectangle information
     */
    public void displayInfo() {
        System.out.println("--- Rectangle Information ---");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
    }

    // Getters and setters
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}