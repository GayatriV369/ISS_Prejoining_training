package DecisionMakingAndLooping;

/**
 * Demonstrates decision making structures in Java
 * - if statement
 * - if-else statement
 * - if-else-if ladder
 * - switch statement
 * - ternary operator
 */
public class DecisionMakingDemo {

    /**
     * Demonstrates simple if statement
     */
    public void demonstrateIfStatement() {
        System.out.println("=== Simple IF Statement Demo ===");

        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }

        if (age < 18) {
            System.out.println("You are not eligible to vote yet.");
        }
    }

    /**
     * Demonstrates if-else statement
     */
    public void demonstrateIfElseStatement() {
        System.out.println("\n=== IF-ELSE Statement Demo ===");

        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // Another example
        double temperature = 25.5;

        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else {
            System.out.println("Weather is pleasant.");
        }
    }

    /**
     * Demonstrates if-else-if ladder
     */
    public void demonstrateIfElseIfLadder() {
        System.out.println("\n=== IF-ELSE-IF Ladder Demo ===");

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Traffic light example
        String lightColor = "yellow";

        if (lightColor.equals("green")) {
            System.out.println("Go!");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Caution!");
        } else if (lightColor.equals("red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("Invalid light color");
        }
    }

    /**
     * Demonstrates switch statement
     */
    public void demonstrateSwitchStatement() {
        System.out.println("\n=== SWITCH Statement Demo ===");

        // Day of week example
        int dayNumber = 3;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day " + dayNumber + " is " + dayName);

        // Calculator example
        char operator = '+';
        int a = 10, b = 5;
        int result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    /**
     * Demonstrates ternary operator
     */
    public void demonstrateTernaryOperator() {
        System.out.println("\n=== Ternary Operator Demo ===");

        int x = 10, y = 20;

        // Simple ternary
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max);

        // Ternary with strings
        int age = 17;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " - Status: " + status);

        // Nested ternary
        int score = 75;
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" : "F";
        System.out.println("Score " + score + " - Grade: " + grade);
    }
}