package VariableTypes;

/**
 * Main class to test variable types
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Variable Types Demo ===");

        // Show initial static variable
        VariableTypesDemo.showTotalStudents();

        System.out.println();

        // Create first student
        VariableTypesDemo student1 = new  VariableTypesDemo("Alice", 20);
        student1.showStudentInfo();
        student1.calculateGrade();

        System.out.println();

        // Create second student
        VariableTypesDemo student2 = new  VariableTypesDemo("Bob", 22);
        student2.showStudentInfo();
        student2.calculateGrade();

        System.out.println();

        // Show how static variable changed
        VariableTypesDemo.showTotalStudents();

        System.out.println();

        // Show instance variables are different for each object
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}