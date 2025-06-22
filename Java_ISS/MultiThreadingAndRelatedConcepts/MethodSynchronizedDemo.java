package MultiThreadingAndRelatedConcepts;

public class MethodSynchronizedDemo {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public int getValue() { return value; }

    public static void main(String[] args) throws InterruptedException {
        MethodSynchronizedDemo obj = new MethodSynchronizedDemo();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 500; i++) obj.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 500; i++) obj.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Value: " + obj.getValue());
    }
}