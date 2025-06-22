package DataTypes;

/**
 * Simplified demonstration of reference data types (Objects and Arrays)
 */
public class SimpleReferenceTypesDemo {

    // Instance variables - reference types
    private String name;
    private int[] scores;
    private Student student;

    /**
     * Constructor
     */
    public SimpleReferenceTypesDemo(String name, int[] scores, Student student) {
        this.name = name;
        this.scores = scores;
        this.student = student;
    }

    /**
     * Demonstrates reference type operations
     */
    public void showReferenceOperations() {
        System.out.println("Simple Reference Data Types Demo ");

        // String operations
        System.out.println("Name: " + name);
        System.out.println("Name length: " + name.length());

        // Array operations
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.println("  - " + score);
        }

        // Object operations
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        // Reference vs null
        String nickname = null;
        System.out.println("Nickname: " + nickname);

        if (nickname != null) {
            System.out.println("Nickname length: " + nickname.length());
        } else {
            System.out.println("No nickname provided");
        }
    }

    /**
     * Demonstrates reference equality
     */
    public void showReferenceEquality() {
        System.out.println("\n Reference Equality Demo ");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));         // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3));         // false (different reference)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)

        Student student1 = new Student("Alice", 'A');
        Student student2 = new Student("Alice", 'A');

        System.out.println("student1 == student2: " + (student1 == student2));           // false
        System.out.println("student1.equals(student2): " + student1.equals(student2));   // false (without overriding equals)
    }

    // Getters
    public String getName() { return name; }
    public int[] getScores() { return scores.clone(); } // Defensive copy
    public Student getStudent() { return student; }
}

/**
 * Simple Student class for demonstration
 */
class Student {
    private String name;
    private char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public char getGrade() { return grade; }
}