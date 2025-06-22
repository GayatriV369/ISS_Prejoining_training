package MultiThreadingAndRelatedConcepts;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b) {
        int result = a + b; // 'result' is a local variable
        return result;
    }
}