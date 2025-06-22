package Abstraction;
// Abstract class
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Concrete class for a full-time employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Concrete class for a part-time employee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 200, 20);

        emp1.displayInfo();
        // Output:
        // Employee Name: Alice
        // Salary: 50000.0

        emp2.displayInfo();
        // Output:
        // Employee Name: Bob
        // Salary: 4000.0
    }
}