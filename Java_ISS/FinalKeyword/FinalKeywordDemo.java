package FinalKeyword;

/**
 * Demonstrates the final keyword in Java
 * - Final variables (constants)
 * - Final methods (cannot be overridden)
 * - Final classes (cannot be extended)
 *
 * @author YourName
 */
public class FinalKeywordDemo {

    // FINAL INSTANCE VARIABLES
    private final String studentId;           // Must be initialized in constructor
    private final int maxCredits = 18;        // Initialized at declaration

    // FINAL STATIC VARIABLES (Constants)
    public static final String UNIVERSITY_NAME = "Java University";
    public static final double PI = 3.14159;
    public static final int MAX_STUDENTS = 1000;

    // Regular variables for comparison
    private String studentName;
    private int currentCredits;

    /**
     * Constructor - final variables must be initialized here if not at declaration
     */
    public FinalKeywordDemo(String studentId, String studentName) {
        this.studentId = studentId;     // Final variable - can only be set once
        this.studentName = studentName; // Regular variable
        this.currentCredits = 0;

        System.out.println("Student created with ID: " + studentId);
    }

    /**
     * Demonstrates final local variables
     */
    public void demonstrateFinalLocalVariables() {
        System.out.println("\n=== Final Local Variables Demo ===");

        // Final local variables
        final int examScore = 95;
        final String examType = "Midterm";

        // Regular local variables
        int totalScore = 0;
        String result;

        // Can use final variables
        totalScore = examScore + 85;
        System.out.println("Exam Type: " + examType);
        System.out.println("Exam Score: " + examScore);
        System.out.println("Total Score: " + totalScore);

        // Cannot modify final variables
        // examScore = 100;  // ERROR: Cannot assign to final variable
        // examType = "Final";  // ERROR: Cannot assign to final variable

        // Can modify regular variables
        totalScore = 200;
        result = "Passed";
        System.out.println("Modified Total Score: " + totalScore);
        System.out.println("Result: " + result);
    }

    /**
     * Demonstrates final instance variables
     */
    public void demonstrateFinalInstanceVariables() {
        System.out.println("\n=== Final Instance Variables Demo ===");

        System.out.println("Student ID: " + studentId);           // Final - cannot change
        System.out.println("Max Credits: " + maxCredits);         // Final - cannot change
        System.out.println("Current Credits: " + currentCredits); // Regular - can change

        // Can modify regular instance variables
        currentCredits = 15;
        studentName = "Updated Name";
        System.out.println("Updated Credits: " + currentCredits);
        System.out.println("Updated Name: " + studentName);

        // Cannot modify final instance variables
        // studentId = "NEW123";     // ERROR: Cannot assign to final variable
        // maxCredits = 20;          // ERROR: Cannot assign to final variable
    }

    /**
     * Demonstrates final static variables (constants)
     */
    public static void demonstrateFinalStaticVariables() {
        System.out.println("\n=== Final Static Variables (Constants) Demo ===");

        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("PI Value: " + PI);
        System.out.println("Max Students: " + MAX_STUDENTS);

        // Calculate circle area using final static variable
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Circle area with radius " + radius + ": " + area);

        // Cannot modify final static variables
        // UNIVERSITY_NAME = "New University";  // ERROR: Cannot assign to final variable
        // PI = 3.14;                          // ERROR: Cannot assign to final variable
    }

    /**
     * FINAL METHOD - cannot be overridden by subclasses
     */
    public final void displayStudentInfo() {
        System.out.println("\n=== Final Method Demo ===");
        System.out.println("This is a final method - cannot be overridden");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("University: " + UNIVERSITY_NAME);
    }

    /**
     * Regular method - can be overridden
     */
    public void displayWelcomeMessage() {
        System.out.println("Welcome to " + UNIVERSITY_NAME + "!");
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public int getCurrentCredits() { return currentCredits; }
    public int getMaxCredits() { return maxCredits; }
}