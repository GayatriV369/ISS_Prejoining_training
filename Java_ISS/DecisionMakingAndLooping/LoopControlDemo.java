package DecisionMakingAndLooping;

/**
 * Demonstrates loop control structures in Java
 * - for loop
 * - while loop
 * - do-while loop
 * - enhanced for loop (for-each)
 * - nested loops
 * - break and continue statements
 */
public class LoopControlDemo {

    /**
     * Demonstrates for loop
     */
    public void demonstrateForLoop() {
        System.out.println("=== FOR Loop Demo ===");

        // Basic for loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // For loop with different increment
        System.out.println("Even numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Reverse for loop
        System.out.println("Countdown from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates while loop
     */
    public void demonstrateWhileLoop() {
        System.out.println("\n=== WHILE Loop Demo ===");

        // Basic while loop
        System.out.println("Numbers 1 to 5 using while:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // While loop with condition
        System.out.println("Sum of numbers until sum exceeds 20:");
        int sum = 0;
        int num = 1;
        while (sum <= 20) {
            sum += num;
            System.out.println("Adding " + num + ", sum = " + sum);
            num++;
        }
    }

    /**
     * Demonstrates do-while loop
     */
    public void demonstrateDoWhileLoop() {
        System.out.println("\n=== DO-WHILE Loop Demo ===");

        // Basic do-while loop
        System.out.println("Numbers 1 to 5 using do-while:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // Do-while executes at least once
        System.out.println("Do-while executes at least once:");
        int j = 10;
        do {
            System.out.println("This executes even though j = " + j + " > 5");
        } while (j < 5);
    }

    /**
     * Demonstrates enhanced for loop (for-each)
     */
    public void demonstrateEnhancedForLoop() {
        System.out.println("\n=== Enhanced FOR Loop (For-Each) Demo ===");

        // Array example
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // String array example
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }

    /**
     * Demonstrates nested loops
     */
    public void demonstrateNestedLoops() {
        System.out.println("\n=== Nested Loops Demo ===");

        // Multiplication table
        System.out.println("Multiplication table (1-5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        // Pattern printing
        System.out.println("\nStar pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates break and continue statements
     */
    public void demonstrateBreakContinue() {
        System.out.println("\n=== Break and Continue Demo ===");

        // Break statement
        System.out.println("Break statement - stop at 7:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue statement
        System.out.println("Continue statement - skip even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Labeled break (for nested loops)
        System.out.println("Labeled break in nested loops:");
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop at i=" + i + ", j=" + j);
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}