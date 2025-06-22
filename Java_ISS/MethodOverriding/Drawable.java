package MethodOverriding;

/**
 * Interface for demonstrating interface-based polymorphism
 */
interface Drawable {
    void draw();
    void erase();
}

interface Movable {
    void move(int x, int y);
    void getPosition();
}

/**
 * Class implementing multiple interfaces
 */
class GraphicObject implements Drawable, Movable {
    private String name;
    private int x, y;

    public GraphicObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " at position (" + x + ", " + y + ")");
    }

    @Override
    public void erase() {
        System.out.println("Erasing " + name);
    }

    @Override
    public void move(int newX, int newY) {
        System.out.println("Moving " + name + " from (" + x + ", " + y + ") to (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }

    @Override
    public void getPosition() {
        System.out.println(name + " is at position (" + x + ", " + y + ")");
    }
}

class Button implements Drawable {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button: [" + label + "]");
    }

    @Override
    public void erase() {
        System.out.println("Erasing button: " + label);
    }

    public void click() {
        System.out.println("Button '" + label + "' clicked!");
    }
}