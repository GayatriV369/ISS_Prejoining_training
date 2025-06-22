package MethodOverriding;

/**
 * Demonstrates method overloading (compile-time polymorphism)
 */
class Calculator {

    // Method overloading - same method name, different parameters
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    public String add(String a, String b) {
        System.out.println("Concatenating strings: '" + a + "' + '" + b + "'");
        return a + b;
    }

    // Method overloading with arrays
    public int add(int[] numbers) {
        System.out.print("Adding array elements: ");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println();
        return sum;
    }
}

/**
 * Constructor overloading demo
 */
class Student {
    private String name;
    private int age;
    private String course;
    private double gpa;

    // Constructor overloading
    public Student(String name) {
        this(name, 18); // Call another constructor
        System.out.println("Constructor with name only");
    }

    public Student(String name, int age) {
        this(name, age, "Undeclared"); // Call another constructor
        System.out.println("Constructor with name and age");
    }

    public Student(String name, int age, String course) {
        this(name, age, course, 0.0); // Call another constructor
        System.out.println("Constructor with name, age, and course");
    }

    public Student(String name, int age, String course, double gpa) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
        System.out.println("Full constructor called");
    }

    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age +
                ", Course: " + course + ", GPA: " + gpa);
    }
}