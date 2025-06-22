package FinalKeyword;

/**
 * Parent class demonstrating final methods
 */
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Final method - cannot be overridden
    public final void startEngine() {
        System.out.println(brand + " engine started!");
    }

    // Regular method - can be overridden
    public void displayInfo() {
        System.out.println("Vehicle: " + brand);
    }
}

/**
 * Child class extending Vehicle
 */
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    // Can override regular method
    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " with " + doors + " doors");
    }

    // Cannot override final method
    // public void startEngine() { } // ERROR: Cannot override final method
}