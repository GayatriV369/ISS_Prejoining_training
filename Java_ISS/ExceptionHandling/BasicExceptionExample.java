package ExceptionHandling;

public class BasicExceptionExample {
    public static void main(String[] args) {
        BasicExceptionExample demo = new  BasicExceptionExample();
        demo.divideNumbers(10, 0);
        demo.divideNumbers(10, 2);
    }

    public void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}