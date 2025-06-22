package StringsAndArrays;

/**
 * Demonstrates String basics in Java
 * - String creation
 * - String immutability
 * - String pool
 * - Basic string operations
 */
public class StringBasicsDemo {

    /**
     * Demonstrates different ways to create strings
     */
    public void demonstrateStringCreation() {
        System.out.println("=== String Creation Demo ===");

        // String literal (stored in string pool)
        String str1 = "Hello World";

        // Using new keyword (creates new object in heap)
        String str2 = new String("Hello World");

        // From character array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);

        // Empty string
        String str4 = "";
        String str5 = new String();

        System.out.println("String literal: " + str1);
        System.out.println("String object: " + str2);
        System.out.println("From char array: " + str3);
        System.out.println("Empty string 1: '" + str4 + "'");
        System.out.println("Empty string 2: '" + str5 + "'");
    }

    /**
     * Demonstrates string immutability
     */
    public void demonstrateStringImmutability() {
        System.out.println("\n=== String Immutability Demo ===");

        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("Original string: " + original);
        System.out.println("After concat: " + modified);
        System.out.println("Original unchanged: " + original);

        // String operations create new objects
        String str = "Hello";
        System.out.println("Before: " + str);
        str = str + " World";  // Creates new string object
        System.out.println("After: " + str);
    }

    /**
     * Demonstrates string pool and equality
     */
    public void demonstrateStringPool() {
        System.out.println("\n=== String Pool Demo ===");

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java").intern();

        System.out.println("str1 == str2: " + (str1 == str2));         // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3));         // false (different reference)
        System.out.println("str1 == str4: " + (str1 == str4));         // true (intern() returns pool reference)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
    }
}