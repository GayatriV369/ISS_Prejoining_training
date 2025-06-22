package MultiThreadingAndRelatedConcepts;

public class MultithreadingDemo {
    public static void main(String[] args) {
        Runnable printA = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A: " + i);
            }
        };

        Runnable printB = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B: " + i);
            }
        };

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);

        thread1.start();
        thread2.start();
    }
}

