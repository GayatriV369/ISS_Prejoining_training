package StringsAndArrays;

/**
 * Demonstrates common String methods in Java
 */
public class StringMethodsDemo {

    /**
     * Demonstrates string information methods
     */
    public void demonstrateStringInfo() {
        System.out.println("=== String Information Methods Demo ===");

        String text = "Java Programming";

        System.out.println("Text: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Is empty: " + text.isEmpty());
        System.out.println("Is blank: " + text.isBlank());
        System.out.println("Character at index 5: " + text.charAt(5));

        // Empty and blank strings
        String empty = "";
        String blank = "   ";
        System.out.println("Empty string - isEmpty(): " + empty.isEmpty());
        System.out.println("Blank string - isEmpty(): " + blank.isEmpty());
        System.out.println("Blank string - isBlank(): " + blank.isBlank());
    }

    /**
     * Demonstrates string comparison methods
     */
    public void demonstrateStringComparison() {
        System.out.println("\n=== String Comparison Methods Demo ===");

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Python";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2));

        // startsWith and endsWith
        String filename = "document.pdf";
        System.out.println("Filename: " + filename);
        System.out.println("Starts with 'doc': " + filename.startsWith("doc"));
        System.out.println("Ends with '.pdf': " + filename.endsWith(".pdf"));
    }

    /**
     * Demonstrates string search methods
     */
    public void demonstrateStringSearch() {
        System.out.println("\n=== String Search Methods Demo ===");

        String sentence = "Java is a programming language. Java is popular.";

        System.out.println("Sentence: " + sentence);
        System.out.println("Contains 'Java': " + sentence.contains("Java"));
        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));
        System.out.println("Index of 'Python': " + sentence.indexOf("Python")); // -1 if not found
    }

    /**
     * Demonstrates string manipulation methods
     */
    public void demonstrateStringManipulation() {
        System.out.println("\n=== String Manipulation Methods Demo ===");

        String text = "  Java Programming  ";

        System.out.println("Original: '" + text + "'");
        System.out.println("Uppercase: '" + text.toUpperCase() + "'");
        System.out.println("Lowercase: '" + text.toLowerCase() + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Strip: '" + text.strip() + "'"); // Java 11+

        // Replace methods
        String message = "Hello World";
        System.out.println("Original: " + message);
        System.out.println("Replace 'o' with '0': " + message.replace('o', '0'));
        System.out.println("Replace 'World' with 'Java': " + message.replace("World", "Java"));
        System.out.println("Replace first 'l': " + message.replaceFirst("l", "L"));
    }

    /**
     * Demonstrates string extraction methods
     */
    public void demonstrateStringExtraction() {
        System.out.println("\n=== String Extraction Methods Demo ===");

        String email = "user@example.com";

        System.out.println("Email: " + email);
        System.out.println("Substring from index 5: " + email.substring(5));
        System.out.println("Substring from 0 to 4: " + email.substring(0, 4));

        // Split method
        String data = "apple,banana,orange,mango";
        String[] fruits = data.split(",");
        System.out.println("Original: " + data);
        System.out.println("Split by comma:");
        for (String fruit : fruits) {
            System.out.println("  - " + fruit);
        }

        // Convert to character array
        String word = "Java";
        char[] chars = word.toCharArray();
        System.out.println("Word: " + word);
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}