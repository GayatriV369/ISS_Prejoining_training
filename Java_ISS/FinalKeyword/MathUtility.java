package FinalKeyword;

/**
 * FINAL CLASS - cannot be extended/subclassed
 * Examples: String, Integer, Double classes in Java are final
 */
public final class MathUtility {

    // Final static methods and variables
    public static final double GOLDEN_RATIO = 1.618;

    /**
     * Private constructor to prevent instantiation
     */
    private MathUtility() {
        // Utility class should not be instantiated
    }

    /**
     * Final static method for calculating square
     */
    public static final int square(int number) {
        return number * number;
    }

    /**
     * Final static method for calculating cube
     */
    public static final int cube(int number) {
        return number * number * number;
    }
}

// This would cause a compilation error:
// class ExtendedMathUtility extends MathUtility { } // ERROR: Cannot extend final class