package DataTypes;

/**
 * Main class to run both demonstrations
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA DATA TYPES DEMO");
        System.out.println("=====================");

        // Primitive types demo
        AllPrimitiveTypesDemo primitiveDemo = new AllPrimitiveTypesDemo(
                (byte) 100,     // byte
                (short) 32000,   // short
                1500000,         // int
                9000000000L,     // long
                3.14f,           // float
                2.71828,         // double
                true,            // boolean
                'J'             // char
        );

        primitiveDemo.showPrimitiveDetails();

        System.out.println("\n Reference Types Demo" + "\n");

        // Reference types demo
        int[] scores = {90, 85, 95};
        Student student = new Student("Alice", 'A');
        SimpleReferenceTypesDemo referenceDemo = new SimpleReferenceTypesDemo("John Doe", scores, student);

        referenceDemo.showReferenceOperations();
        referenceDemo.showReferenceEquality();
    }
}