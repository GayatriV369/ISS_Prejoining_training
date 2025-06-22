package ExceptionHandling.ThrowVSThrows;

public class ThrowDemo {
    public static void main(String[] args) {
        ThrowDemo demo = new ThrowDemo();

        try {
            demo.checkAge(15);
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public void checkAge(int age) {
        if (age < 18) {
            // Using 'throw' to actually throw an exception
            throw new RuntimeException("Age must be 18 or older");
        }
        System.out.println("Age is valid: " + age);
    }
}