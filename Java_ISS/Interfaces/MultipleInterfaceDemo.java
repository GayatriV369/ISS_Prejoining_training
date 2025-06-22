package Interfaces;

// First interface
interface Flyable {
    void fly();
    int getMaxAltitude();
}

// Second interface
interface Swimmable {
    void swim();
    int getMaxDepth();
}

// Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky");
    }

    @Override
    public int getMaxAltitude() {
        return 1000; // feet
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the water");
    }

    @Override
    public int getMaxDepth() {
        return 10; // feet
    }

    public void quack() {
        System.out.println(name + " says: Quack! Quack!");
    }
}

class Fish implements Swimmable {
    private String species;

    public Fish(String species) {
        this.species = species;
    }

    @Override
    public void swim() {
        System.out.println(species + " is swimming underwater");
    }

    @Override
    public int getMaxDepth() {
        return 500; // feet
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        Fish fish = new Fish("Goldfish");

        // Duck can fly and swim
        duck.fly();
        duck.swim();
        duck.quack();

        System.out.println("Duck max altitude: " + duck.getMaxAltitude() + " feet");
        System.out.println("Duck max depth: " + duck.getMaxDepth() + " feet");

        // Fish can only swim
        fish.swim();
        System.out.println("Fish max depth: " + fish.getMaxDepth() + " feet");
    }
}