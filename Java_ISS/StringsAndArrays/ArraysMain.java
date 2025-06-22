package StringsAndArrays;

/**
 * Main class to demonstrate all array operations
 */
public class ArraysMain {
    public static void main(String[] args) {
        System.out.println("JAVA ARRAYS DEMONSTRATION");
        System.out.println("==========================");

        // Array Basics
        ArrayBasicsDemo basicsDemo = new ArrayBasicsDemo();
        basicsDemo.demonstrateArrayDeclaration();
        basicsDemo.demonstrateArrayAccess();
        basicsDemo.demonstrateDefaultValues();

        System.out.println("\n" + "=".repeat(50));

        // Array Operations
        ArrayOperationsDemo operationsDemo = new ArrayOperationsDemo();
        operationsDemo.demonstrateArrayTraversal();
        operationsDemo.demonstrateArraySearch();
        operationsDemo.demonstrateMinMax();
        operationsDemo.demonstrateSumAverage();
        // operationsDemo.demonstrateArrayInput(); // Uncomment for interactive input

        System.out.println("\n" + "=".repeat(50));


    }
}