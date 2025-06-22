package ExceptionHandling.ThrowVSThrows;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        try {
            demo.validateEmail("invalid-email");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    // Using 'throws' to declare that this method might throw an exception
    public void validateEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Invalid email format");
        }
        System.out.println("Email is valid: " + email);
    }
}