package StringsAndArrays;

/**
 * Demonstrates StringBuilder and StringBuffer for efficient string operations
 */
public class StringBuilderDemo {

    /**
     * Demonstrates StringBuilder usage
     */
    public void demonstrateStringBuilder() {
        System.out.println("=== StringBuilder Demo ===");

        StringBuilder sb = new StringBuilder();

        // Append operations
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");

        System.out.println("After appends: " + sb.toString());

        // Insert operation
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb.toString());

        // Delete operation
        sb.delete(6, 16); // Remove "Beautiful "
        System.out.println("After delete: " + sb.toString());

        // Replace operation
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb.toString());

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Capacity and length
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity());
    }

    /**
     * Demonstrates performance difference between String and StringBuilder
     */
    public void demonstratePerformance() {
        System.out.println("\n=== Performance Comparison Demo ===");

        int iterations = 1000;

        // String concatenation (inefficient)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;

        // StringBuilder (efficient)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        String sbResult = sb.toString();
        long sbTime = System.currentTimeMillis() - startTime;

        System.out.println("String concatenation time: " + stringTime + " ms");
        System.out.println("StringBuilder time: " + sbTime + " ms");
        System.out.println("StringBuilder is " + (stringTime / (sbTime + 1)) + "x faster");
    }

    /**
     * Demonstrates StringBuffer (thread-safe version of StringBuilder)
     */
    public void demonstrateStringBuffer() {
        System.out.println("\n=== StringBuffer Demo ===");

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Programming");
        System.out.println("After append: " + buffer.toString());

        buffer.insert(4, " 8");
        System.out.println("After insert: " + buffer.toString());

        System.out.println("StringBuffer is thread-safe, StringBuilder is not");
        System.out.println("Use StringBuilder for single-threaded applications");
        System.out.println("Use StringBuffer for multi-threaded applications");
    }
}