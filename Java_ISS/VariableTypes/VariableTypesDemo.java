package VariableTypes;

/**
 * Simple demonstration of variable types in Java
 * @author YourName
 */
public class VariableTypesDemo {

    // STATIC VARIABLE (Class Variable)
    // Shared by all objects of this class
    private static int totalStudents = 0;

    // INSTANCE VARIABLES (Fields)
    // Each object has its own copy
    private String name;
    private int age;

    /**
     * Constructor
     */
    public VariableTypesDemo(String name, int age) {
        // LOCAL VARIABLES
        // Only exist inside this method
        String message = "Creating new student";

        // Set instance variables
        this.name = name;
        this.age = age;

        // Update static variable
        totalStudents++;

        System.out.println(message + ": " + name);
    }

    /**
     * Method showing local variables
     */
    public void calculateGrade() {
        // LOCAL VARIABLES
        // These only exist inside this method
        int exam1 = 85;
        int exam2 = 92;
        int total = exam1 + exam2;
        double average = total / 2.0;

        System.out.println(name + "'s average: " + average);

        // Local variables are destroyed when method ends
    }

    /**
     * Method showing instance variables
     */
    public void showStudentInfo() {
        // LOCAL VARIABLE
        String info = "Student Information";

        // Using INSTANCE VARIABLES
        System.out.println(info);
        System.out.println("Name: " + name);        // instance variable
        System.out.println("Age: " + age);          // instance variable
    }

    /**
     * Static method showing static variables
     */
    public static void showTotalStudents() {
        // LOCAL VARIABLE
        String report = "School Report";

        // Using STATIC VARIABLE
        System.out.println(report);
        System.out.println("Total Students: " + totalStudents);

        // Cannot use instance variables here
        // System.out.println(name); // ERROR!
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public static int getTotalStudents() { return totalStudents; }
}