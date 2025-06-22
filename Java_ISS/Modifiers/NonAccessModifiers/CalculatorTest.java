package Modifiers.NonAccessModifiers;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Accessing static variable
        System.out.println("Initial Calculation Count: " + Calculator.getCalculationCount());

        // Accessing final variable
        System.out.println("E: " + calc.E);

        // Accessing static final constant
        System.out.println("Calculator Version: " + Calculator.CALCULATOR_VERSION);

        // Using synchronized method
        double sum = calc.add(5.0, 3.0);
        System.out.println("Sum: " + sum);

        // Using final method
        double product = calc.multiply(5.0, 3.0);
        System.out.println("Product: " + product);

        // Accessing static variable after calculation
        System.out.println("Calculation Count: " + Calculator.getCalculationCount());
    }
}