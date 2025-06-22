package StringsAndArrays;

/**
 * Demonstrates array basics in Java
 * - Array declaration and initialization
 * - Different ways to create arrays
 * - Array access and modification
 */
public class ArrayBasicsDemo {

    /**
     * Demonstrates different ways to declare and initialize arrays
     */
    public void demonstrateArrayDeclaration() {
        System.out.println("=== Array Declaration and Initialization Demo ===");

        // Method 1: Declare and initialize separately
        int[] numbers1;
        numbers1 = new int[5];  // Creates array of size 5 with default values (0)

        // Method 2: Declare and initialize together
        int[] numbers2 = new int[5];

        // Method 3: Initialize with values
        int[] numbers3 = {10, 20, 30, 40, 50};

        // Method 4: Using new keyword with values
        int[] numbers4 = new int[]{1, 2, 3, 4, 5};

        // Different data types
        String[] names = {"Alice", "Bob", "Charlie"};
        double[] prices = {19.99, 25.50, 12.75};
        boolean[] flags = {true, false, true, false};
        char[] letters = {'A', 'B', 'C', 'D'};

        System.out.println("Arrays created successfully!");
        System.out.println("numbers3 length: " + numbers3.length);
        System.out.println("names length: " + names.length);
    }

    /**
     * Demonstrates array access and modification
     */
    public void demonstrateArrayAccess() {
        System.out.println("\n=== Array Access and Modification Demo ===");

        int[] scores = {85, 92, 78, 96, 88};

        // Accessing elements
        System.out.println("Original array:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        // Modifying elements
        scores[0] = 90;  // Change first element
        scores[2] = 80;  // Change third element

        System.out.println("\nAfter modification:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        // Array bounds
        System.out.println("\nArray length: " + scores.length);
        System.out.println("First element: " + scores[0]);
        System.out.println("Last element: " + scores[scores.length - 1]);
    }

    /**
     * Demonstrates default values in arrays
     */
    public void demonstrateDefaultValues() {
        System.out.println("\n=== Array Default Values Demo ===");

        int[] intArray = new int[3];
        double[] doubleArray = new double[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];

        System.out.println("Default values:");
        System.out.println("int array: " + java.util.Arrays.toString(intArray));
        System.out.println("double array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("boolean array: " + java.util.Arrays.toString(boolArray));
        System.out.println("String array: " + java.util.Arrays.toString(stringArray));
    }
}