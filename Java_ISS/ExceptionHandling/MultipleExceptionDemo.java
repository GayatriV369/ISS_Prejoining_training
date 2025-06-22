package ExceptionHandling;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        MultipleExceptionDemo demo = new MultipleExceptionDemo();
        demo.parseAndDivide("10", "2");
        demo.parseAndDivide("abc", "2");
        demo.parseAndDivide("10", "0");
    }

    public void parseAndDivide(String num1, String num2) {
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}