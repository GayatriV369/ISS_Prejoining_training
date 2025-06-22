package StringsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Demonstrates common array operations
 * - Traversing arrays
 * - Searching in arrays
 * - Finding min/max
 * - Calculating sum and average
 */
public class ArrayOperationsDemo {

    /**
     * Demonstrates different ways to traverse arrays
     */
    public void demonstrateArrayTraversal() {
        System.out.println("=== Array Traversal Demo ===");

        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

        // Method 1: Traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        // Method 2: Enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop:");
        int index = 1;
        for (String fruit : fruits) {
            System.out.println(index++ + ". " + fruit);
        }

        // Method 3: While loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < fruits.length) {
            System.out.println((i + 1) + ". " + fruits[i]);
            i++;
        }
    }

    /**
     * Demonstrates searching in arrays
     */
    public void demonstrateArraySearch() {
        System.out.println("\n=== Array Search Demo ===");

        int[] numbers = {10, 25, 30, 45, 50, 65, 70};
        int searchValue = 45;

        // Linear search
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Searching for: " + searchValue);

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Not found");
        }

        // Using Arrays.binarySearch() for sorted arrays
        int binarySearchResult = Arrays.binarySearch(numbers, searchValue);
        System.out.println("Binary search result: " + binarySearchResult);
    }

    /**
     * Demonstrates finding minimum and maximum values
     */
    public void demonstrateMinMax() {
        System.out.println("\n=== Min/Max Demo ===");

        int[] temperatures = {23, 18, 31, 27, 19, 35, 22};

        int min = temperatures[0];
        int max = temperatures[0];

        for (int temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println("Temperatures: " + Arrays.toString(temperatures));
        System.out.println("Minimum temperature: " + min + "°C");
        System.out.println("Maximum temperature: " + max + "°C");
    }

    /**
     * Demonstrates sum and average calculation
     */
    public void demonstrateSumAverage() {
        System.out.println("\n=== Sum and Average Demo ===");

        double[] grades = {85.5, 92.0, 78.5, 96.0, 88.5, 91.0};

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;

        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + String.format("%.2f", average));

        // Count grades above average
        int aboveAverage = 0;
        for (double grade : grades) {
            if (grade > average) {
                aboveAverage++;
            }
        }

        System.out.println("Grades above average: " + aboveAverage);
    }

    /**
     * Demonstrates array input from user
     */
    public void demonstrateArrayInput() {
        System.out.println("\n=== Array Input Demo ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();

        String[] studentNames = new String[size];
        int[] studentAges = new int[size];

        // Input student data
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Display student data
        System.out.println("\nStudent Information:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + studentNames[i] + " - " + studentAges[i] + " years old");
        }

        scanner.close();
    }
}