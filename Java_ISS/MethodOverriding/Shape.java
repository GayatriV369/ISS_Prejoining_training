package MethodOverriding;

/**
 * Base class for demonstrating runtime polymorphism
 */
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method - must be overridden
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method that can be overridden
    public void displayInfo() {
        System.out.println("Shape color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Method that uses polymorphism internally
    public void compareArea(Shape other) {
        double thisArea = this.calculateArea();
        double otherArea = other.calculateArea();

        if (thisArea > otherArea) {
            System.out.println("This shape is larger");
        } else if (thisArea < otherArea) {
            System.out.println("Other shape is larger");
        } else {
            System.out.println("Both shapes have equal area");
        }
    }
}

/**
 * Circle class - implements Shape
 */
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Circle Information ===");
        System.out.println("Radius: " + radius);
        super.displayInfo();
    }
}

/**
 * Rectangle class - implements Shape
 */
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Rectangle Information ===");
        System.out.println("Length: " + length + ", Width: " + width);
        super.displayInfo();
    }
}

/**
 * Triangle class - implements Shape
 */
class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Triangle Information ===");
        System.out.println("Sides: " + side1 + ", " + side2 + ", " + side3);
        super.displayInfo();
    }
}