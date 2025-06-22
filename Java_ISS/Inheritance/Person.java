package Inheritance;

/**
 * Grandparent class
 */
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

/**
 * Parent class - inherits from Person
 */
class Employee extends Person {
    protected String company;
    protected double salary;

    public Employee(String name, int age, String company, double salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working at " + company);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name + ", Age: " + age);
        System.out.println("Company: " + company + ", Salary: $" + salary);
    }
}

/**
 * Child class - inherits from Employee (multilevel inheritance)
 */
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String company, double salary, int teamSize) {
        super(name, age, company, salary);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting");
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Team Size: " + teamSize);
    }
}