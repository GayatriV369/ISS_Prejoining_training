package Modifiers.NonAccessModifiers;

/**
 * Demonstrates non-access modifiers with a simple 'Calculator' example
 */
public class Calculator {

    // static: belongs to the class, not objects
    private static int calculationCount = 0;

    // final: value cannot be changed
    public final double E = 2.71828;

    // static final: constant
    public static final String CALCULATOR_VERSION = "1.0";

    // synchronized: method can only be accessed by one thread at a time
    public synchronized double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    // final method: cannot be overridden
    public final double multiply(double a, double b) {
        return a * b;
    }

    // static method: can be called without creating an object
    public static int getCalculationCount() {
        return calculationCount;
    }
}