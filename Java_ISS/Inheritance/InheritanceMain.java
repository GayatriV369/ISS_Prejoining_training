package Inheritance;

/**
 * Main class to demonstrate inheritance concepts
 */
public class InheritanceMain {
    public static void main(String[] args) {
        System.out.println("=== JAVA INHERITANCE DEMONSTRATION ===");

        // Basic Inheritance Demo
        System.out.println("\n--- Basic Inheritance ---");

        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.eat();      // Inherited method
        dog.sleep();    // Inherited method
        dog.bark();     // Dog-specific method

        System.out.println();

        Cat cat = new Cat("Whiskers", 2, "Orange");
        cat.displayInfo();
        cat.eat();      // Inherited method
        cat.meow();     // Cat-specific method

        // Method Overriding Demo
        System.out.println("\n--- Method Overriding ---");

        Vehicle vehicle = new Vehicle("Generic", 2020);
        vehicle.start();
        vehicle.displayInfo();

        System.out.println();

        Car car = new Car("Toyota", 2022, 4);
        car.start();    // Overridden method
        car.displayInfo();
        car.honk();

        System.out.println();

        Motorcycle bike = new Motorcycle("Harley", 2021, false);
        bike.start();   // Overridden method
        bike.displayInfo();
        bike.wheelie();

        // Multilevel Inheritance Demo
        System.out.println("\n--- Multilevel Inheritance ---");

        Manager manager = new Manager("John Smith", 35, "TechCorp", 75000, 8);
        manager.eat();              // From Person class
        manager.work();             // From Employee class
        manager.conductMeeting();   // From Manager class
        manager.displayEmployeeInfo();

        // Polymorphism with inheritance
        System.out.println("\n--- Polymorphism ---");

        Animal[] animals = {
                new Dog("Rex", 4, "German Shepherd"),
                new Cat("Fluffy", 1, "White")
        };

        for (Animal animal : animals) {
            animal.displayInfo();   // Calls overridden method
            animal.eat();
            System.out.println();
        }

        Vehicle[] vehicles = {
                new Car("Honda", 2023, 2),
                new Motorcycle("Yamaha", 2022, true)
        };

        for (Vehicle v : vehicles) {
            v.start();      // Calls overridden method
            v.displayInfo();
            System.out.println();
        }
    }
}