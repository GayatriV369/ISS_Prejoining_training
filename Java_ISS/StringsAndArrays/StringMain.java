package StringsAndArrays;

/**
 * Main class to demonstrate all string operations
 */
public class StringMain {
    public static void main(String[] args) {
        System.out.println("JAVA STRINGS DEMONSTRATION");
        System.out.println("===========================");

        // String Basics
        StringBasicsDemo basicsDemo = new StringBasicsDemo();
        basicsDemo.demonstrateStringCreation();
        basicsDemo.demonstrateStringImmutability();
        basicsDemo.demonstrateStringPool();

        System.out.println("\n" + "=".repeat(50));

        // String Methods
        StringMethodsDemo methodsDemo = new StringMethodsDemo();
        methodsDemo.demonstrateStringInfo();
        methodsDemo.demonstrateStringComparison();
        methodsDemo.demonstrateStringSearch();
        methodsDemo.demonstrateStringManipulation();
        methodsDemo.demonstrateStringExtraction();

        System.out.println("\n" + "=".repeat(50));

        // StringBuilder and StringBuffer
        StringBuilderDemo builderDemo = new StringBuilderDemo();
        builderDemo.demonstrateStringBuilder();
        builderDemo.demonstratePerformance();
        builderDemo.demonstrateStringBuffer();

        System.out.println("\n" + "=".repeat(50));


    }
}