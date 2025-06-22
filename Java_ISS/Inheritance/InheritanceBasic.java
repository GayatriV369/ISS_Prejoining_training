package Inheritance;

/**
 * Parent class (Superclass)
 */
class Animal {
    // Instance variables
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }

    // Methods
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/**
 * Child class (Subclass) - inherits from Animal
 */
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    // Dog-specific method
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Breed: " + breed);
    }
}

/**
 * Another child class
 */
class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("Cat constructor called");
    }

    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}