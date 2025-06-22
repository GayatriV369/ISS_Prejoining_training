package DataTypes;

/**
 * Demonstration of all primitive data types in Java
 */
public class AllPrimitiveTypesDemo {

    // Instance variables for all primitive types
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private boolean booleanValue;
    private char charValue;

    /**
     * Constructor to initialize all primitive types
     */
    public AllPrimitiveTypesDemo(byte byteValue, short shortValue, int intValue, long longValue,
                                 float floatValue, double doubleValue, boolean booleanValue, char charValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.intValue = intValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.booleanValue = booleanValue;
        this.charValue = charValue;
    }

    /**
     * Demonstrates operations and output for each primitive type
     */
    public void showPrimitiveDetails() {
        System.out.println("=== All Primitive Data Types Demo ===");

        // Byte
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // Short
        System.out.println("Short Value: " + shortValue);
        System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // Int
        System.out.println("Int Value: " + intValue);
        System.out.println("Int Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // Long
        System.out.println("Long Value: " + longValue);
        System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // Float
        System.out.println("Float Value: " + floatValue);
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // Double
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // Boolean
        System.out.println("Boolean Value: " + booleanValue);

        // Char
        System.out.println("Char Value: " + charValue);
        System.out.println("Char Unicode: " + (int) charValue); // Show Unicode value
    }

    // Getters
    public byte getByteValue() { return byteValue; }
    public short getShortValue() { return shortValue; }
    public int getIntValue() { return intValue; }
    public long getLongValue() { return longValue; }
    public float getFloatValue() { return floatValue; }
    public double getDoubleValue() { return doubleValue; }
    public boolean getBooleanValue() { return booleanValue; }
    public char getCharValue() { return charValue; }
}